package com;

public class Ejercicio1 {
	public static void main(String[] args) {
		Runnable ej1 = () ->System.out.println("Hola desde un hilo");
		Thread hilo = new Thread(ej1);
		
		System.out.println("Hola desde el main");
		hilo.start();
	}

}
