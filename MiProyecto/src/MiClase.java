
public class MiClase {

	public static void main(String[] args) {
		// Similar al Console.log()
		System.out.println("Hola Mundo!");
		
		
		/*TIPO DE DATOS
		 * 
		 * int
		 * double
		 * float
		 * boolean
		 * String
		 * char
		 * byte
		 * short
		 * long
		 * 
		 * */
		
		/* VARIABLES
		 * 
		 * tipo nombreVariable = valor;
		 * 
		 * */
		
		
		byte miByte = 12;
		int entero;
		double doble;
		float flotante;
		short miShort;
		long miLong;
		boolean booleano;
		char caracter;
		String string;
		
		
//		System.out.println("Tipo: Mínimo - Máximo");
//		System.out.println("int: Min= " + Integer.MIN_VALUE + " -  Max=" + Integer.MAX_VALUE);
//		System.out.println("byte: Min= " + Byte.MIN_VALUE + " - Max= " + Byte.MAX_VALUE);
		
		//Casteo o Cast (parseo)
		entero = 40;
		doble = 12.5;
		double res1 = 2.09;
//		System.out.println(res1);
		
		int res2 = (int) res1;
//		System.out.println(res2);
		
		int a = 30;
		int b = 12;
//		System.out.println(a/b);
		
		double c = (double) a/b;
//		System.out.println(c);
		
		
		//Operadores
		
		/*
		 * Matemáticos = suma, resta, multiplicación, división, módulo 
		 * Lógicos = AND (&&), OR (||), NOT (!)
		 * Comparación = >, <, >=, <=, ==, !=
		 * */
		
		
		String palabra1 = "B";
		String palabra2 = "A"; 
		
		// string1.compareTo(string2)
		// 5
		
		//System.out.println(palabra1.compareTo(palabra2));
		//System.out.println(palabra1.equals(palabra2));
		
		int variableInt = 77;
//		System.out.println( (char) variableInt);
		
		char variableChar = 'M';
//		System.out.println((int) variableChar);
		
		/*
		 * Dada una palabra ingresada por el usuario (por teclado), mostrar su equivalente en ASCII
		 * (letra por letra)
		 * Ej: Hola -> 72 111 108 97
		 * 
		 * Extra: agregarle los espacios en blanco
		 * 
		 * */
		
		System.out.println( Math.PI );
		System.out.println( Math.pow(3, 2) );
		System.out.println(Math.sqrt(25));
		
		double num = 45.4977;
		System.out.println(Math.floor(num)); //redondea para abajo
		System.out.println(Math.ceil(num)); //redondea para arriba
		System.out.println(Math.round(num)); //redondea para arriba si el decimail es >= .5
		
		
	}

}
