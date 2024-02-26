
public class Funciones {

	public static void main(String[] args) {
		
		System.out.println("Hola Mundo fuera dentro del Main");
		
		HelloWorld();
		
		System.out.println(nombreUsuario("Rogelio"));
		
	}
	
	//FUNCIONES
	/* function nombre(parametros){
	 * 	return algo;
	 * }
	 */
	
	/*modificador int nombre(int dato, String nombre){
	 * 	dato
	 * 	nombre
	 *  return entero;
	 * }
	 */
	
	public static void HelloWorld() {
		System.out.println("Hola Mundo!");
	}
	
	public static String nombreUsuario(String name) {
		return "Hola " + name + ", buen día!";
	}
	
	

}
