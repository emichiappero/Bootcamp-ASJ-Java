
public class Clases {

	public static void main(String[] args) {
		
		Automovil auto1 = new Automovil("Ferrari", 2024);
		
//		auto1.anio = 2023;
//		auto1.marca = "Mercedes Benz";
		
		auto1.mostrarDatos();
		
		auto1.setMarca("Volvo");
		System.out.println("Cambiando Marca: " + auto1.getMarca());
		
		auto1.mostrarDatos();
		
		auto1.setColor("Rojo Furioso");
		auto1.mostrarDatos();
		
		
		//--------
		Automovil auto2 = new Automovil();
		auto2.mostrarDatos();

		//------
		Camion camion1 = new Camion("Scania", 2000, 20000.5);
		camion1.mostrar();
		
	}

}
