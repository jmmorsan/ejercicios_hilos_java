package sync;

public class ContadorSinSync {
	
	private static int contador = 0;
	
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println("Soy: " + name);
		
		Thread t1 = new Thread(()-> {
            System.out.println("Soy: " + Thread.currentThread().getName());
            for (int i = 0; i < 10000; i++) {
                contador++;
            }
        });
		
		Thread t2 = new Thread(() -> {
			System.out.println("Soy: " + Thread.currentThread().getName());
			for (int i = 0; i < 10000; i++) {
				contador++;
			}
		} );
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
