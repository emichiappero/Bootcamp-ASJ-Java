
public class Camion extends Automovil {
	
	private double cargaMax;
	
	public Camion(String marca, int anio, double carga) {
		//super(); //llamo al constructor vacio, de la clase padre
		super(marca, anio ); //llamo al constructor con parametros, de la clase padre
		
		this.cargaMax = carga;
		
		System.out.println("Creando Instancia de Camión");
	}

	public double getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(double cargaMax) {
		this.cargaMax = cargaMax;
	}
	
	public void mostrar() {
		System.out.println("[ MARCA CAMIÓN: "+ super.getMarca() +" | AÑO CAMIÓN: "+ super.getAnio()+" | COLOR CAMIÓN: " + super.getColor() + " | CARGA MAX: " + this.getCargaMax());
	}

	

}
