package br.com.helciodasilva.jpmsapp;

import br.com.helciodasilva.jpmslib.service.LibService;
import br.com.helciodasilva.jpmslib.utils.LibUtils;
import br.com.helciodasilva.jpmstransitivelib.service.TransitiveLibService;

public class JpmsAppApplication {

	public static void main(String[] args) {
		new LibService().create();
		new LibUtils().create(); // Não deveria estar acessível
		new TransitiveLibService().create(); // Não deveria estar acessível 
	}

}
