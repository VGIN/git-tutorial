//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.19 a las 03:50:46 PM CET 
//


package com.cargos.bscs.peticion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cargos.bscs.peticion package. 
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

    private final static QName _IdTransaccion_QNAME = new QName("", "IdTransaccion");
    private final static QName _Msisdn_QNAME = new QName("", "Msisdn");
    private final static QName _Importe_QNAME = new QName("", "Importe");
    private final static QName _Accion_QNAME = new QName("", "Accion");
    private final static QName _FechaDescarga_QNAME = new QName("", "FechaDescarga");
    private final static QName _Entidad_QNAME = new QName("", "Entidad");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cargos.bscs.peticion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatosPeticion }
     * 
     */
    public DatosPeticion createDatosPeticion() {
        return new DatosPeticion();
    }

    /**
     * Create an instance of {@link XMLPeticion }
     * 
     */
    public XMLPeticion createXMLPeticion() {
        return new XMLPeticion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IdTransaccion")
    public JAXBElement<String> createIdTransaccion(String value) {
        return new JAXBElement<String>(_IdTransaccion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Msisdn")
    public JAXBElement<String> createMsisdn(String value) {
        return new JAXBElement<String>(_Msisdn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Importe")
    public JAXBElement<String> createImporte(String value) {
        return new JAXBElement<String>(_Importe_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Accion")
    public JAXBElement<String> createAccion(String value) {
        return new JAXBElement<String>(_Accion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FechaDescarga")
    public JAXBElement<String> createFechaDescarga(String value) {
        return new JAXBElement<String>(_FechaDescarga_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Entidad")
    public JAXBElement<String> createEntidad(String value) {
        return new JAXBElement<String>(_Entidad_QNAME, String.class, null, value);
    }

}
