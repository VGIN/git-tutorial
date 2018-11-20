//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.19 a las 03:50:46 PM CET 
//


package com.cargos.bscs.peticion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}DatosPeticion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datosPeticion"
})
@XmlRootElement(name = "XML_Peticion")
public class XMLPeticion {

    @XmlElement(name = "DatosPeticion", required = true)
    protected DatosPeticion datosPeticion;

    /**
     * Obtiene el valor de la propiedad datosPeticion.
     * 
     * @return
     *     possible object is
     *     {@link DatosPeticion }
     *     
     */
    public DatosPeticion getDatosPeticion() {
        return datosPeticion;
    }

    /**
     * Define el valor de la propiedad datosPeticion.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPeticion }
     *     
     */
    public void setDatosPeticion(DatosPeticion value) {
        this.datosPeticion = value;
    }

}
