package com.bootcamp.relaciones.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.relaciones.models.DetalleModel;
import com.bootcamp.relaciones.models.PagosModel;
import com.bootcamp.relaciones.models.PedidoModel;
import com.bootcamp.relaciones.repositories.DetalleRepository;
import com.bootcamp.relaciones.repositories.PagosRepository;
import com.bootcamp.relaciones.repositories.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class ApiController {
	
	@Autowired
	PedidoRepository pedidoRepo;
	
	@Autowired
	DetalleRepository detalleRepo;
	
	@Autowired
	PagosRepository pagoRepo;
	
	@GetMapping
	public void metEjemplo() {
		
		//Nuevo Pedido
		PedidoModel pedido1 = new PedidoModel();
		pedido1.setFecha(new Date());
		pedidoRepo.save(pedido1);
		
		//Nuevo Detalle de Pedido
		DetalleModel detalle1 = new DetalleModel();
		detalle1.setCantidad(1);
		detalle1.setPrecio(125.31);
		detalle1.setPedido(pedido1);
		detalleRepo.save(detalle1);
		
		DetalleModel detalle2 = new DetalleModel();
		detalle2.setCantidad(3);
		detalle2.setPrecio(123.35);
		detalle2.setPedido(pedido1);
		detalleRepo.save(detalle2);
		
		
		//Crear nuevo Pago
		PagosModel pago1 = new PagosModel();
		pago1.setPedido(pedido1);
		pago1.setMetodo("Mercado Pago");
		pagoRepo.save(pago1);
		
		
	}
	
	@GetMapping("/listado")
	public void listado() {
		//Cantidad de Pedidos
		var cantPedidos = pedidoRepo.count();
		System.out.println("CANT. PEDIDOS = " + cantPedidos);
		
		//Cantidad de Pedidos
		var cantDetalle = detalleRepo.count();
		System.out.println("CANT. DETALLES = " + cantDetalle);
		
		System.out.println("---------------------------");
		
		//Buscar todos los Pedidos
		var listadoPedidos = pedidoRepo.findAll();
		listadoPedidos.forEach(p -> {
			System.out.println("PEDIDO #" + p.getId()+ " - FECHA: " + p.getFecha());
		});
		
		System.out.println("---------------------------");
		
		//Buscamos un Pedido en particular
		var ped = pedidoRepo.findById(3).get();
		System.out.println("PEDIDO #" + ped.getId() + " - FECHA: " + ped.getFecha());
		
		System.out.println("DETALLE DEL PEDIDO #" + ped.getId());
		ped.getDetalle().forEach(d -> {
			System.out.println("DET. #"+ d.getId() + " - CANT: "+ d.getCantidad() + " - PRECIO: "+ d.getPrecio());
		});
		
		System.out.println("---------------------------");
		
		//Elimino un pedido
		//pedidoRepo.deleteById(2);
		
		//Busco todos los detalles
		var detalles = detalleRepo.findAll();
		detalles.forEach(dets -> {
			System.out.println("DETALLE #"+ dets.getId() + " - PED_ID: " + dets.getPedido().getId() + "["+dets.getPedido().getFecha()+"]");
		});
		
		System.out.println("---------------------------");
		
		
		
		
		//Actualizo el detalle
		var detalle = detalleRepo.findById(3).get();
		detalle.setPrecio(100);
		detalleRepo.save(detalle);
		
		//Elimino el detalle #2 de un Pedido #3
//		ped.getDetalle().remove(detalle);
//		pedidoRepo.save(ped);
//		detalleRepo.delete(detalle);
		
		//Elimino un Pago
//		var pago = pagoRepo.findById(1).get();
//		pagoRepo.delete(pago);
		
	}
	

}
