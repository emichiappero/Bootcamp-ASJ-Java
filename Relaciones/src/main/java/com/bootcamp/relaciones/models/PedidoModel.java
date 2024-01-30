package com.bootcamp.relaciones.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pedidos")
public class PedidoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date fecha;
	
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<DetalleModel> detalle;
	
	@OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
	private PagosModel pago;
	
	//Constructores
	public PedidoModel() {}
	
	public PedidoModel(int id, Date fecha) {
		super();
		this.id = id;
		this.fecha = fecha;
	}

	//GETTERS & SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<DetalleModel> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetalleModel> detalle) {
		this.detalle = detalle;
	}

	public PagosModel getPago() {
		return pago;
	}

	public void setPago(PagosModel pago) {
		this.pago = pago;
	}
	
	

}
