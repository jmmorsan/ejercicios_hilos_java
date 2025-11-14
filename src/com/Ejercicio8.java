package com;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		
		Thread hiloA = new Thread(()->  {
				for (int i = 0; i < 10; i++) {
					System.out.println("Hilo A");
					Thread.yield();
					try { Thread.sleep(50); } catch (InterruptedException e) {}
				}			
		});
		
		Thread hiloB = new Thread(()->  {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hilo B");
				try { Thread.sleep(50); } catch (InterruptedException e) {}
			}			
		});
		
		hiloA.start();
		hiloB.start();
		
		try {
			hiloA.join();
			hiloB.join();
			
		} catch (InterruptedException e) {
			System.out.println("Hilo interrumpido: " + e.getMessage());

		}

	}

}