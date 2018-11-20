package com.cargos.bscs;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.cargos.bscs.peticion.DatosPeticion;
import com.cargos.bscs.peticion.ObjectFactory;
import com.cargos.bscs.peticion.XMLPeticion;
import com.cargos.bscs.respuesta.Error;

public class GenerateXML {
	
	
	
	public static XMLPeticion fillDatosPeticion () {
		
		ObjectFactory factory  = new ObjectFactory();

		XMLPeticion   xmlPeticion   = factory.createXMLPeticion();
		DatosPeticion datosPeticion = factory.createDatosPeticion();
		
		//MSISDN de la línea 
		datosPeticion.setMsisdn("685210147");
		//C para cargo y R para refund
		datosPeticion.setAccion("C");
		//Entidad proveedora de la aplicación descargada
		datosPeticion.setEntidad("ENTIDAD");
		//Aplicación descargada
				
		//Fecha hora de la descarga/refund.‘DD/MM/YYYY HH24:MM:SS’.
		datosPeticion.setFechaDescarga("");
		//Importe de la descarga. Será >=0 si ACCION = ‘C’ y <=0 si ACCION = ‘R’. 
		//Separador decimal de los céntimos el punto.
		datosPeticion.setImporte("130.12");
		//Identificador de la transacción asociada .de 32 dígitos hexadecimales agrupados en 5 (8-4-4-4-12)
		datosPeticion.setIdTransaccion("8c999ffe-4a43-46b0-ba57-5ff21c78c019");
		xmlPeticion.setDatosPeticion(datosPeticion);
		datosPeticion.setIdTransaccion("8c999ffe-4a43-46b0-ba57-5ff21c78c018");
		xmlPeticion.setDatosPeticion(datosPeticion);
		
		return xmlPeticion;
	}

	private Error fillRespuesta() {
		com.cargos.bscs.respuesta.ObjectFactory factory = new com.cargos.bscs.respuesta.ObjectFactory();
		Error error = factory.createError();
		error.setCodigo("");
		error.setDescripcion("");
		
		return null;
	}

	
    /**
     * Genera el XML para la petición 26112
     * @throws JAXBException
     */
	public static void getXML_Peticion_26112 () throws JAXBException {
		
		XMLPeticion xmlPeticion = fillDatosPeticion();
		
		JAXBContext jaxbContext = JAXBContext.newInstance(XMLPeticion.class);	
		Marshaller  ms      = jaxbContext.createMarshaller();
		ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ms.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
	    ms.marshal(xmlPeticion,System.out);
		
	}
	
	/**
	 * @throws JAXBException 
	 * 
	 */
	public static void getXML_Respuesta_26112() throws JAXBException {
		
		JAXBContext context = JAXBContext.newInstance(Error.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Error error =  (Error) unmarshaller.unmarshal(new File("src/Libro.xml") );
		System.out.println(error.getCodigo());
		
	}
	

   


}
