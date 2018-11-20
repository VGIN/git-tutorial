//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.19 a las 03:51:10 PM CET 
//


package com.cargos.bscs.respuesta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cargos.bscs.respuesta package. 
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

    private final static QName _Tipo_QNAME = new QName("", "Tipo");
    private final static QName _Codigo_QNAME = new QName("", "Codigo");
    private final static QName _IdHost_QNAME = new QName("", "IdHost");
    private final static QName _Descripcion_QNAME = new QName("", "Descripcion");
    private final static QName _Sistema_QNAME = new QName("", "Sistema");
    private final static QName _TimeStamp_QNAME = new QName("", "TimeStamp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cargos.bscs.respuesta
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XMLRespuesta }
     * 
     */
    public XMLRespuesta createXMLRespuesta() {
        return new XMLRespuesta();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Tipo")
    public JAXBElement<String> createTipo(String value) {
        return new JAXBElement<String>(_Tipo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Codigo")
    public JAXBElement<String> createCodigo(String value) {
        return new JAXBElement<String>(_Codigo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IdHost")
    public JAXBElement<String> createIdHost(String value) {
        return new JAXBElement<String>(_IdHost_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Descripcion")
    public JAXBElement<String> createDescripcion(String value) {
        return new JAXBElement<String>(_Descripcion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Sistema")
    public JAXBElement<String> createSistema(String value) {
        return new JAXBElement<String>(_Sistema_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TimeStamp")
    public JAXBElement<String> createTimeStamp(String value) {
        return new JAXBElement<String>(_TimeStamp_QNAME, String.class, null, value);
    }

}
