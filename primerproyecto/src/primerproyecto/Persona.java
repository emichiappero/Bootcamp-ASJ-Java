package primerproyecto;

public class Persona {
	
	//Atributos
	//Tipo_dato atributo
	
	String nombre;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	String apellido;
	String apodo;
	int edad;
	int altura;
	int peso;
	
	//Constructor
	public Persona() {
		System.out.println("Se creo objeto del tipo Persona");
	}
	
	//Métodos o funciones
	public void comer() {}
	
	public void caminar() {}
	
	public void hablar() {}
	
	public void dormir() {}
	

}
