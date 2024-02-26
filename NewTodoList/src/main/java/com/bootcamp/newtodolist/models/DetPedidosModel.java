package com.bootcamp.newtodolist.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "detalle")
public class DetPedidosModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_det", nullable = false)
	private Integer id_det;
	
	@NotNull(message = "El nombre del detalle no puede ser nulo")
	private String nombre;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ped")
    private PedidossModel pedido;

	public Integer getId_det() {
		return id_det;
	}

	public void setId_det(Integer id_det) {
		this.id_det = id_det;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public PedidossModel getPedido() {
		return pedido;
	}

	public void setPedido(PedidossModel pedido) {
		this.pedido = pedido;
	}

	public DetPedidosModel() {
		super();
	}

	public DetPedidosModel(Integer id_det, String nombre) {
		super();
		this.id_det = id_det;
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_det, nombre, pedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetPedidosModel other = (DetPedidosModel) obj;
		return Objects.equals(id_det, other.id_det) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(pedido, other.pedido);
	}
	
	

}
