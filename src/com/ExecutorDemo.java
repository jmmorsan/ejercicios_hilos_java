package com;

import java.util.concurrent.*;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {
	 public static void main(String[] args) throws Exception {
	        ExecutorService pool = Executors.newFixedThreadPool(3);
	        for (int i = 1; i <= 5; i++) pool.submit(new Hilo("tarea-" + i));
	        pool.shutdown();
	        pool.awaitTermination(3, TimeUnit.SECONDS);
	        System.out.println("✅ Todas las tareas completadas.");
	    }
}