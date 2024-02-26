package com.ejemplo.proyecto.holaMundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
	
	/*
	 * El controlador ENTIENDE las peticiones que hace un Cliente.
	 * Significa que necesitamos:
	 * - URL
	 * - Método
	 * - Datos (opcional)
	 * */
	
	@GetMapping("/saludo/{name}") // localhost:8080/saludo/Juan [GET]
	public String holaMundo(@PathVariable String name) {
		return "Hola "+ name +"!";
	}
	
}


/*
 * SPRING BOOT
 * 
 * - Controllers = Maneja la petición de la API
 * - Services = Lógica de negocio
 * - Repositories = Permite hacer consultas a la BD
 * - Models = Reprensentación de la estructura de una entidad
 * 
 * */
 