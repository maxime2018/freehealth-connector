//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.03.05 à 11:48:06 AM CET 
//


package org.taktik.connector.business.domain.kmehr.v20121001.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CD-ORTHO-INTERFACEvalues.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-ORTHO-INTERFACEvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="hacoated"/>
 *     &lt;enumeration value="porous"/>
 *     &lt;enumeration value="smouth"/>
 *     &lt;enumeration value="cementwithab"/>
 *     &lt;enumeration value="cementwithoutab"/>
 *     &lt;enumeration value="allpoly"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="metalbacked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-ORTHO-INTERFACEvalues")
@XmlEnum
public enum CDORTHOINTERFACEvalues {

    @XmlEnumValue("hacoated")
    HACOATED("hacoated"),
    @XmlEnumValue("porous")
    POROUS("porous"),
    @XmlEnumValue("smouth")
    SMOUTH("smouth"),
    @XmlEnumValue("cementwithab")
    CEMENTWITHAB("cementwithab"),
    @XmlEnumValue("cementwithoutab")
    CEMENTWITHOUTAB("cementwithoutab"),
    @XmlEnumValue("allpoly")
    ALLPOLY("allpoly"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("metalbacked")
    METALBACKED("metalbacked");
    private final String value;

    CDORTHOINTERFACEvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDORTHOINTERFACEvalues fromValue(String v) {
        for (CDORTHOINTERFACEvalues c: CDORTHOINTERFACEvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
