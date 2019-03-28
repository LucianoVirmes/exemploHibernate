package br.edu.unoesc;

import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		Persistence.createEntityManagerFactory("MinhaPersistencia");
		
		
	}

}
