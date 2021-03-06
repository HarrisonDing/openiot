//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.25 at 12:49:31 
//


package org.openiot.commons.osdspec.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openiot.commons.osdspec.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GraphMeta_QNAME = new QName("http://www.openiot.eu/osdspec", "graphMeta");
    private final static QName _Description_QNAME = new QName("http://www.openiot.eu/osdspec", "description");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openiot.commons.osdspec.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestPresentation }
     * 
     */
    public RequestPresentation createRequestPresentation() {
        return new RequestPresentation();
    }

    /**
     * Create an instance of {@link ServiceID }
     * 
     */
    public ServiceID createServiceID() {
        return new ServiceID();
    }

    /**
     * Create an instance of {@link PresentationAttr }
     * 
     */
    public PresentationAttr createPresentationAttr() {
        return new PresentationAttr();
    }

    /**
     * Create an instance of {@link QueryControls }
     * 
     */
    public QueryControls createQueryControls() {
        return new QueryControls();
    }

    /**
     * Create an instance of {@link ServiceName }
     * 
     */
    public ServiceName createServiceName() {
        return new ServiceName();
    }

    /**
     * Create an instance of {@link OSDSpec }
     * 
     */
    public OSDSpec createOSDSpec() {
        return new OSDSpec();
    }

    /**
     * Create an instance of {@link Widget }
     * 
     */
    public Widget createWidget() {
        return new Widget();
    }

    /**
     * Create an instance of {@link ServiceDescription }
     * 
     */
    public ServiceDescription createServiceDescription() {
        return new ServiceDescription();
    }

    /**
     * Create an instance of {@link DynamicAttrMaxValue }
     * 
     */
    public DynamicAttrMaxValue createDynamicAttrMaxValue() {
        return new DynamicAttrMaxValue();
    }

    /**
     * Create an instance of {@link OSMO }
     * 
     */
    public OSMO createOSMO() {
        return new OSMO();
    }

    /**
     * Create an instance of {@link QuerySchedule }
     * 
     */
    public QuerySchedule createQuerySchedule() {
        return new QuerySchedule();
    }

    /**
     * Create an instance of {@link OAMO }
     * 
     */
    public OAMO createOAMO() {
        return new OAMO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openiot.eu/osdspec", name = "graphMeta")
    public JAXBElement<String> createGraphMeta(String value) {
        return new JAXBElement<String>(_GraphMeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openiot.eu/osdspec", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

}
