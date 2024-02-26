package com.bootcamp.newtodolist.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.newtodolist.models.PedidossModel;
import com.bootcamp.newtodolist.models.DetPedidosModel;
import com.bootcamp.newtodolist.models.TareaModel;
import com.bootcamp.newtodolist.repositories.PedidosRepository;
import com.bootcamp.newtodolist.repositories.TareaRepository;

import com.bootcamp.newtodolist.repositories.PedidosRepository;
import com.bootcamp.newtodolist.repositories.DetPedidosRepository;

@Service
public class TareaService {
	
	//Inyeccion de dependencia (conecta)
	@Autowired
	TareaRepository tareaRepository;
	
	@Autowired
	PedidosRepository pedidosRep;
	
	// obtener Tareas
	public List<TareaModel> obtenerTareas(){
		//return tareaRepository.miConsulta(true, "i");
		//return tareaRepository.findAll(); // Obtengo todas las Tareas;
		//tareaRepository.findByNombreLike("hola");
		return tareaRepository.myQuery("asd");
	}
	
	// obtener Tarea según ID
	public Optional<TareaModel> obtenerTareaPorId(int id) {
		return tareaRepository.findById(id); //Obtengo una Tarea con cierto ID
	}
	
	// insertar Tarea
	public String crearTarea(TareaModel tarea) {
		System.out.println(tareaRepository.save(tarea)); //Guardo la Tarea en la BD
		
		return "Tarea insertada correctamente";
	}
	
	// modificar Tarea
	public String modificarTarea(int id, TareaModel tarea) {
		System.out.println(id);
		System.out.println(tarea);
		TareaModel t = tareaRepository.findById(id).get(); //obtener la Tarea que coincide con el ID
		if(t != null) {
			t.setNombre(tarea.getNombre());
			t.setDescripcion(tarea.getDescripcion());
			tareaRepository.save(t);
			return "Tarea #" + id +" modificada correctamente";
		}
		return "Error";
	}
	
	// eliminar Tarea
	public String eliminarTarea(int id) {
		tareaRepository.deleteById(id); //Elimino la Tarea de la BD
		return "Tarea eliminada correctamente";
	}
	
	public Optional<PedidossModel> prueba() {

		//Insertando un pedido
		PedidossModel pedido = new PedidossModel();
		pedido.setNombre("pedido 1");
		
		//Insertando Detalle
		DetPedidosModel detalle = new DetPedidosModel();
		detalle.setNombre("Detalle del pedido 1");
		
		DetPedidosModel detalle2 = new DetPedidosModel();
		detalle2.setNombre("Detalle del pedido 1");
		
		DetPedidosModel detalle3 = new DetPedidosModel();
		detalle3.setNombre("Detalle del pedido 1");
		
		//Asigno el pedido a los detalles
		detalle.setPedido(pedido);
		detalle2.setPedido(pedido);
		detalle3.setPedido(pedido);
		
		//Creo una lista de detalles
		List<DetPedidosModel> det_pedidos = new ArrayList<>();
		det_pedidos.add(detalle);
		det_pedidos.add(detalle2);
		det_pedidos.add(detalle3);
		
		pedido.setDetalle(det_pedidos);
		
		//PedidossModel peds = pedidosRep.save(pedido);
		
		//Consultas
//		System.out.println("#" + peds.getId_ped() + ": " + peds.getNombre());
//		peds.getDetalle().forEach(p -> {
//			System.out.println(p.getNombre() + " - " + p.getPedido().getId_ped() );
//		});
		
		//CONSULTAS
		
		List<PedidossModel> pedidos = pedidosRep.findAll();
		System.out.println("Cantidad: " + pedidos.size());
		pedidos.forEach(p -> {
			System.out.println("ID: " + p.getId_ped()+ " - NOMBRE: "+ p.getNombre());
		});
		
		
		return null;
	}

}
