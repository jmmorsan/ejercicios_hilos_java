package com;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Thread hilo = new Thread(()->  {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println("Hilo interrumpido: " + e.getMessage());
					}
		});

		System.out.println("Estado antes de start(); " + hilo.getState());
		hilo.start();
		
		hilo.getState();
		System.out.println("Estado despues de start(); " + hilo.getState());
		System.out.println("is Alive? " + hilo.isAlive());

		try {
			hilo.join();
			System.out.println("Estado despues de join(); " + hilo.getState());
			System.out.println("is Alive? " + hilo.isAlive());
		} catch (InterruptedException e) {

		}
	}
	
}