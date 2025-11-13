package com;

public class Main {
	public static void main(String[] args) {
		DosArgumentosBloque sumar = (x, y) -> {
			int resultado = x + y;
		};
		
	}
		public static void DosArgumentosTipo() {
			DosArgumentosTipo sumar = (Integer x1, Integer x2) -> x1 + x2;
			System.out.println("Suma con tipos: " + sumar.operar(5, 10));
		}
		public static void DosArgumentos() {
		DosArgumentos suma = (x,y) -> x + y;
		System.out.println("Suma: " + suma.operar(3, 4));
		
		DosArgumentos resta = (x,y) -> x - y;
		System.out.println("Resta: " + resta.operar(3, 4));
		
		DosArgumentos multiplicacion = (x,y) -> x * y;
		System.out.println("Multiplicacion: " + multiplicacion.operar(3, 4));
	}
	
	public static void UnArgumento() {
		UnArgumento s1 = mensaje -> System.out.println("Prueba argumento -> " + mensaje);
		s1.imprimir("Hola mundo");
		
		UnArgumento ua2 = prueba -> {
            for(int i = 0; i < 10; i++) {
                System.out.println(prueba);
            }
        };
	}
		
		public static void SinArgumentos() {
			SinArgumentos s1 = () -> System.out.println("Esto es s1");
			SinArgumentos s2 = () -> System.out.println("Esto es s2");
			SinArgumentos s3 = () -> {
				for(int i = 0; i < 10; i++) {
	                System.out.println("Esto es s " + i);
	            }
			};
			s1.ejecutar();
			s2.ejecutar();
			s3.ejecutar();
			
		}
		
	
}