import java.util.ArrayList;

import java.util.Iterator;

public class ListaArray {

	public static void main(String[] args) {
		//ArrayList<tipo> nombre = new ArrayList<tipo>();
		
		//Declaración del ArrayList
		ArrayList<String> miLista = new ArrayList();
		
		//Agregar datos
		miLista.add("Rojo");
		miLista.add("Azul");
		miLista.add("Verde");
		
		for(int i=0;i<miLista.size(); i++) {
			//Mostrar cada elemento
			System.out.println(miLista.get(i));
		}
		
		
		miLista.add("Negro");
		miLista.add("Blanco");
		miLista.add(3, "Amarillo");
		
		imprimir(miLista);
		
		System.out.println("--------");
		System.out.println(miLista.get(3));
		System.out.println(miLista.get(4));
		
		//Eliminar un elemento
		miLista.remove(1);
		miLista.remove("Verde");
		
		imprimir(miLista);
		
		//Devuelve el indice del elemento
		System.out.println(miLista.indexOf("Amarillo"));
		System.out.println(miLista.lastIndexOf("Amarillo"));
		
		//Eliminar toda la lista
		//miLista.clear();
		
		imprimir(miLista);
		
		//Chequea si está vacío
		System.out.println(miLista.isEmpty());
		
		System.out.println("----Iterando----");
		
		
		//Iterador
		//Iterator<tipo> nombre = lista.iterator();
		Iterator<String> miIterador = miLista.iterator();
		
		while(miIterador.hasNext()) {
			String elemento = miIterador.next();
			System.out.print(elemento + " - ");
		}
		
	}
	
	public static void imprimir(ArrayList<String> lista) {
		System.out.println("--------");
		for(String item: lista) {
			System.out.println(item);
		}
	}

}
