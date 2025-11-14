package com;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Thread a = new Thread(()->  {
			System.out.println("Soy: " + Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
            	System.out.println("Soy: " + Thread.currentThread().getName() + " y mi contador es: " + i);
            }
		});
		
		Thread b = new Thread(()->  {
			System.out.println("Soy: " + Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
            	System.out.println("Soy: " + Thread.currentThread().getName() + " y mi contador es: " + i);
            }
		});
		
		a.setName("Hilo A");
		b.setName("Hilo B");
		a.start();
		
		try {
			a.join();
			b.start();
			b.join();

		} catch (InterruptedException e) {

		}

	}

}
