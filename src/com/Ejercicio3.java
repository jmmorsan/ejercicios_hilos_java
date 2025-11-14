package com;

public class Ejercicio3 implements Runnable {
	private String nombre;

	public Ejercicio3(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hilo " + nombre + " - Iteración " + (i + 1));
			try {
				Thread.sleep(1000); // Pausa de 1000 ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread hilo1 = new Thread(new Ejercicio3("A"));

		hilo1.start();
	}

}
