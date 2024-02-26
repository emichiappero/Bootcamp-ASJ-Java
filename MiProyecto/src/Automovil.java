
public class Automovil {

	//Atributos
	private String marca;
	private int anio;
	private String color;
	
	public Automovil() {
		System.out.println("Creando instancia de Clase Automovil vacía");
	}
	
	public Automovil(String m, int a) {
		this.marca = m;
		this.anio = a;
		this.color = "-";
		System.out.println("Creando instancia de Clase Automovil");
	}
	
	//Get = Devolver un atributo
	public String getMarca() {
		return this.marca;
	}
	
	//Set = Setear o cambiar el valor de un atributo
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Métodos
	//modificador retorno nombre(param){ }
	

	public void mostrarDatos() {
		System.out.println("[ MARCA: "+ this.marca + " | AÑO: " + this.anio +" | COLOR: "+ this.color +" ]");
	}
}
