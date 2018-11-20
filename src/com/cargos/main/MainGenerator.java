package com.cargos.main;

import javax.xml.bind.JAXBException;

import com.cargos.bscs.GenerateXML;
import com.cargos.util.ValidadorXml;

public class MainGenerator {
	
	
	public static void main(String[] args) throws JAXBException {
		
		//Validar el xml recibido
		boolean xmlValido = ValidadorXml.validateXMLSchema(null, null);
		
		if (xmlValido)
		GenerateXML.getXML_Peticion_26112();
		else 
			System.out.println("XML mal formado ");
	
		
	}

}
