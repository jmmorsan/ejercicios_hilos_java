package sync;

public class ContadorConMonitor {
	
	private static int contador = 0;
	private static Object Monitor = new Object();
	
	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				synchronized (Monitor) {
					System.out.println("Soy: " + Thread.currentThread().getName());
					contador++;
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				synchronized (Monitor) {
					System.out.println("Soy: " + Thread.currentThread().getName());
					contador++;
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Valor final del contador: " + contador);
	}

}
