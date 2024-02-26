
public class Estructuras {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 20;
		
		//IF - ELSE
		if(a < b) {
		 System.out.println("Muestra esta línea en caso de ser VERDADERO");
		}else if( a == 'a'){
			//hago alguna otra cosa
		}else {
			System.out.println("Muestra esta línea cuando es FALSO");
		}
		
		
		//Switch
		char variable = 'z';
		switch(variable) {
			case 'a':
				System.out.println("La variables es a");
				break;
			case 'b':
				System.out.println("La variable es b");
				break;
			default: 
				System.out.println("La variables es distinta");
				break;
		}
		
		//Ternario: IF/ELSE en una línea
		// condicion ? res_verdadero : res_falso;
		boolean status = true;
		String miVar = status ? "Aprobado":"Desaprobado";
		System.out.println(miVar);
		
		
		// FOR
		for(byte i=1; i<=50; i++) {
//			System.out.println("Línea " + i);
			System.out.print(i + " ");
			continue;
			
		}
		
		System.out.println("While ");
		// WHILE
		byte i = 0;
		while(status == false) {
			System.out.print(i++ + " ");
			if(i == 8) {
				status = true;
				//break;
			}
		}
		
		System.out.println("\nDo-While ");
		//DO-WHILE
		i = 0;
		status = true;
		do {
			System.out.print(i++ + " ");
			if(i == 8) {
				status = true;
			}
		}while(status == false);
		
		
		//Ejercicio
		// Pedir al usuario que ingrese ¿cuántas notas quiere ingresar?
		// Según eso, pedir el valor de cada nota (1 al 10)
		// Sacar el promedio
		// P/D: hacerlo con FOR, WHILE y DO-WHILE 
		

	}

}
