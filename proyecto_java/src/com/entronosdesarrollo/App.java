package com.entronosdesarrollo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce tu nombre:");
		String nombre = leerStringPorConsola();
		System.out.println("Hola, "+nombre);
		
		
		
	}

	public static String leerStringPorConsola() {
		Scanner sc= new Scanner (System.in);
		String result =sc.next();
		sc.close();
		return result;
	}
	
	
	
}
