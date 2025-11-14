package com;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		Thread hilo = new Thread(()->  {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					System.out.println("Hilo interrumpido: " + e.getMessage());
				}
				System.out.println("Hilo finalizado.");
		});
		
		hilo.start();
		
		try {
			hilo.join(1000);
			
			if (hilo.isAlive()) {
                System.out.println("El hilo NO ha terminado. El tiempo ha expirado.");
            } else {
                System.out.println("El hilo ha terminado correctamente antes del timeout.");
            }
			
		} catch (InterruptedException e) {

		}

	}

}
