package com;

public class Ejercicio2 {
	public static void main(String[] args) {
		Runnable r1 = () ->{ System.out.println("##" + Thread.currentThread().getName());};
		Thread hilo = new Thread(r1);
		hilo.setName("Hilo-Usuario");		
		hilo.start();
		
		Thread hilo2 = new Thread(r1);
		hilo2.setName("Hilo-OtroUsuario");
	}

}
