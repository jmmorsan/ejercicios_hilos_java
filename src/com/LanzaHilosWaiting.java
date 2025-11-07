package com;

public class LanzaHilosWaiting {
	 private static final Object LOCK = new Object();

	    public static void main(String[] args) throws InterruptedException {
	        Thread t = new Thread(() -> {
	            synchronized (LOCK) {
	                try {
	                    System.out.println(Thread.currentThread().getName() + " esperando...");
	                    LOCK.wait();
	                } catch (InterruptedException ignored) {}
	            }
	        }, "tWaiting");
	        t.start();
	        Thread.sleep(100);
	        System.out.println(t.getName() + " -> " + t.getState());
	    }
	}
