package com;

public class Ejercicio3   {

		//n run(), usa un for del 1 al 5.
		//En cada iteración imprime el número y llama a Thread.sleep(1000).
		//Captura InterruptedException con try/catch.
		//Comprueba que el hilo principal puede seguir haciendo otras cosas mientras tanto.
	
	public static void main(String[] args) {
		Thread hilo = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("Número: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("Hilo interrumpido: " + e.getMessage());
					}
				}
			}
		});

		hilo.start();

		// Hilo principal haciendo otras cosas
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hilo principal haciendo otras cosas: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Hilo principal interrumpido: " + e.getMessage());
			}
		}
	}
	
}
