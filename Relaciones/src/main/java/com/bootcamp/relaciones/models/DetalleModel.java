package com.bootcamp.relaciones.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="detalles")
public class DetalleModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double precio;
	
	private int cantidad;
	
	@ManyToOne
	@JoinColumn(name="ped_id")
	private PedidoModel pedido;
	
	public DetalleModel() {}

	public DetalleModel(int id, double precio, int cantidad, PedidoModel pedido) {
		super();
		this.id = id;
		this.precio = precio;
		this.cantidad = cantidad;
		this.pedido = pedido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public PedidoModel getPedido() {
		return pedido;
	}

	public void setPedido(PedidoModel pedido) {
		this.pedido = pedido;
	}
	
	
	
	

}

//  MAESTRO      DETALLE
//  ONE			 MANY
//  Pedidos ---> Detalles