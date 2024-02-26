package com.bootcamp.newtodolist.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.newtodolist.ErrorHandler;
import com.bootcamp.newtodolist.models.PedidossModel;
import com.bootcamp.newtodolist.models.TareaModel;
import com.bootcamp.newtodolist.services.TareaService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/tareas") // localhost:8080/tareas
public class TareaController {
	
	@Autowired
	TareaService tareaService;
	
//	@GetMapping("/test")
//	public ResponseEntity<String> testing() {
//		//return new ResponseEntity<>("Hola Mundo", HttpStatus.NOT_FOUND);
//		return ResponseEntity.ok("algo");
//	}
	
	@GetMapping() // [GET] localhost:8080/tareas
	public ResponseEntity<List<TareaModel>> getTareas() {
		
		return ResponseEntity.ok( tareaService.obtenerTareas() );
	}
	
	@GetMapping("/{id}") //[GET] localhost:8080/tareas/3
	public ResponseEntity<Optional<TareaModel>> getTareaById(@PathVariable int id) {
		return ResponseEntity.ok( tareaService.obtenerTareaPorId(id) );
	}
	
	@PostMapping() // [POST] localhost:8080/tareas
	public ResponseEntity<Object> createTarea(@Valid @RequestBody TareaModel tarea, BindingResult bindingResult) {
		
		
		//pregunto si existen erroes (del tipo "modelo". Ej: not null, vacio, decimal, min, max, regex, email, etc.)
		if(bindingResult.hasErrors()) {
			
			Map<String, String> errors = new ErrorHandler().validacionInputs(bindingResult);
			
			System.out.println(errors);
			
			return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>(tareaService.crearTarea(tarea), HttpStatus.OK);
		
	}
	
	@PutMapping("/{id}") // [PUT] localhost:8080/tareas/3
	public ResponseEntity<String> updateTarea(@PathVariable int id, @RequestBody TareaModel tarea) {
		return ResponseEntity.ok( tareaService.modificarTarea(id, tarea));
	}
	
	
	@DeleteMapping("/{id}") // [DELETE] localhost:8080/tareas/5
	public ResponseEntity<String> deleteTarea(@PathVariable int id) {
		return ResponseEntity.ok( tareaService.eliminarTarea(id));
	}
	
	
	@GetMapping("/prueba")
	public ResponseEntity<Optional<PedidossModel>> prueba() {
		System.out.println(tareaService.prueba());
		return ResponseEntity.ok(tareaService.prueba());
	}
	

}
