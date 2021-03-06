package org.taktik.connector.business.mycarenetcommons.builders.util;

import org.taktik.connector.business.mycarenetcommons.mapper.SendRequestMapper;
import org.taktik.connector.business.mycarenetdomaincommons.domain.Blob;
import org.taktik.connector.business.mycarenetdomaincommons.domain.CommonInput;
import org.taktik.connector.business.mycarenetdomaincommons.domain.Routing;
import org.taktik.connector.technical.config.ConfigFactory;
import org.taktik.connector.technical.config.Configuration;
import org.taktik.connector.technical.exception.TechnicalConnectorException;
import org.taktik.connector.technical.idgenerator.IdGeneratorFactory;
import org.taktik.connector.technical.service.etee.domain.EncryptionToken;
import org.taktik.connector.technical.service.keydepot.KeyDepotManagerFactory;
import org.taktik.connector.technical.service.sts.security.Credential;
import org.taktik.connector.technical.utils.IdentifierType;
import be.fgov.ehealth.mycarenet.commons.protocol.v2.SendRequestType;
import java.util.Set;
import org.joda.time.DateTime;

public final class RequestBuilderUtil {
   private static final String IDENTIFIER_TYPE_PROPERTY = ".keydepot.identifiertype";
   private static final String IDENTIFIER_VALUE_PROPERTY = ".keydepot.identifiervalue";
   private static final String APPLICATION_ID_PROPERTY = ".keydepot.application";
   private static final long ETK_IDENTIFIER_DEFAULT_VALUE = 820563481L;
   private static Configuration config = ConfigFactory.getConfigValidator();

   private RequestBuilderUtil() {
   }

   public static void fillInputToMycarenetRequest(SendRequestType sendRequest, CommonInput commonInput, Routing routing, Blob blob, byte[] xadesValue, String projectName, Credential credential) throws TechnicalConnectorException {
      sendRequest.setId(IdGeneratorFactory.getIdGenerator("xsid").generateId());
      sendRequest.setIssueInstant(new DateTime());
      sendRequest.setCommonInput(SendRequestMapper.mapCommonInput(commonInput));
      sendRequest.setRouting(SendRequestMapper.mapRouting(routing));
      sendRequest.setDetail(SendRequestMapper.mapBlobToBlobType(blob));
      sendRequest.setXades(BlobUtil.generateXades(sendRequest.getDetail(), credential, projectName));
   }

   public static Set<EncryptionToken> getEtk(String projectName) throws TechnicalConnectorException {
      String identifierTypeString = config.getProperty(projectName + ".keydepot.identifiertype", "CBE");
      Long identifierValue = config.getLongProperty(projectName + ".keydepot.identifiervalue", 820563481L);
      String applicationId = config.getProperty(projectName + ".keydepot.application", "MYCARENET");
      int identifierSource = 48;
      IdentifierType identifier = IdentifierType.lookup(identifierTypeString, (String)null, identifierSource);
      if (identifier == null) {
         throw new IllegalStateException("invalid configuration : identifier with type ]" + identifierTypeString + "[ for source ETKDEPOT not found");
      } else {
         return KeyDepotManagerFactory.getKeyDepotManager().getEtkSet(IdentifierType.CBE, identifierValue, applicationId);
      }
   }
}
