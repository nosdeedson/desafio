package br.edson.dedafio;

import javax.persistence.Persistence;

public class ConexaoBD {
	
	public static void main(String[] args) {
		
		try {
			Persistence.createEntityManagerFactory("fabricaBebidaPU");
			System.out.println("conectou");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("falha");
		}
	}

}
