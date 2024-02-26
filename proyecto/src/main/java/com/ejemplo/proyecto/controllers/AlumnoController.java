package com.ejemplo.proyecto.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.proyecto.models.Alumno;

@RestController
public class AlumnoController {
	
	//Listado de Alumnos (harcodeado)
	List<Alumno> alumnos = new ArrayList<Alumno>(
		List.of(new Alumno(1, "Bob", "Patiño", 9.5),
				new Alumno(2, "Moe", "Sczyslak", 4),
				new Alumno(3, "Troy", "McLure", 2.6),
				new Alumno(4, "Edna", "Krabaples", 8.7))
	);
	
	
	@GetMapping("/alumnos") // [GET] localhost:8080/alumnos
	public List<Alumno> getAlumnos() {
		return this.alumnos;
	}
	
	@GetMapping("/alumnos/{id}") // [GET] localhost:8080/alumnos/2
	public Alumno getAlumnoById(@PathVariable int id) {
		
		//Buscar el alumno que tenga ese ID
		for(Alumno alumno: alumnos) {
			if(alumno.getId() == id) {
				//Retorno el Alumno
				return alumno;
			}
		}
		
		return null;
	}
	
	@PostMapping("/alumnos") // [POST] localhost:8080/alumnos
	public Alumno postAlumno(@RequestBody Alumno a) {
		this.alumnos.add(new Alumno(a.getId(), a.getNombre(), a.getApellido(), a.getNota()));
//		for(Alumno alumno: alumnos) {
//			System.out.println(alumno.getNombre());
//		}
		
		return a;
	}
	
	@PutMapping("/alumnos/{id}") // [PUT] localhost:8080/alumnos/2
	public String putAlumno(@PathVariable int id, @RequestBody Alumno a) {
		for(Alumno alumno: alumnos) {
			if(alumno.getId() == id) {
				alumno.setNombre(a.getNombre());
				alumno.setApellido(a.getApellido());
				alumno.setNota(a.getNota());
			}
		}
		return "Modificando el Alumno ID ="+ id;
	}
	
	
	@DeleteMapping("/alumnos/{id}") //[DELETE] localhost:8080/alumnos/2
	public String deleteAlumnoById(@PathVariable int id) {
		
		return "Eliminando el Alumno " + id;
		
	}

}
