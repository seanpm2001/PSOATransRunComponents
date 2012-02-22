//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.14 at 04:18:23 PM GMT-04:00 
//


package rif.bld.parser.jaxb;

import java.util.ArrayList;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for slot-Frame.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="slot-Frame.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.w3.org/2007/rif#}TERM"/>
 *         &lt;group ref="{http://www.w3.org/2007/rif#}TERM"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ordered" type="{http://www.w3.org/2001/XMLSchema}string" fixed="yes" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "slot-Frame.type", propOrder = {
    "content"
})
public class SlotFrameType {

    @XmlElementRefs({
        @XmlElementRef(name = "List", namespace = "http://www.w3.org/2007/rif#", type = rif.bld.parser.jaxb.List.class),
        @XmlElementRef(name = "Const", namespace = "http://www.w3.org/2007/rif#", type = Const.class),
        @XmlElementRef(name = "Var", namespace = "http://www.w3.org/2007/rif#", type = Var.class),
        @XmlElementRef(name = "Expr", namespace = "http://www.w3.org/2007/rif#", type = Expr.class),
        @XmlElementRef(name = "External", namespace = "http://www.w3.org/2007/rif#", type = JAXBElement.class)
    })
    protected java.util.List<java.lang.Object> content;
    @XmlAttribute
    protected String ordered;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Const" is used by two different parts of a schema. See: 
     * line 323 of file:/Users/peterpaulr/2011/CS6795-Project/RIF_BLD_Parser/BLDCond.xsd
     * line 323 of file:/Users/peterpaulr/2011/CS6795-Project/RIF_BLD_Parser/BLDCond.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link rif.bld.parser.jaxb.List }
     * {@link JAXBElement }{@code <}{@link ExternalTERMType }{@code >}
     * {@link Const }
     * {@link Expr }
     * {@link Var }
     * 
     * 
     */
    public java.util.List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the ordered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdered() {
        if (ordered == null) {
            return "yes";
        } else {
            return ordered;
        }
    }

    /**
     * Sets the value of the ordered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdered(String value) {
        this.ordered = value;
    }

}
