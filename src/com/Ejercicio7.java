package com;

public class Ejercicio7 {
	
	private static int contador = 0;

	public static void main(String[] args) {
		
		
		Thread hilo = new Thread(()->  {
				try {
					while (!Thread.currentThread().isInterrupted()) {
						contador++;
						System.out.println("Contador: " + contador);
					Thread.sleep(500);
					}
				} catch (InterruptedException e) {
					System.out.println("Hilo interrumpido: " + e.getMessage());
				}			
		});
		
		hilo.start();
		
		try {
			Thread.sleep(2000);
			hilo.interrupt();
			hilo.join();
			
		} catch (InterruptedException e) {
			System.out.println("Hilo interrumpido: " + e.getMessage());

		}

	}

}
