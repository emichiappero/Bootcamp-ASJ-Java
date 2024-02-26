package com.bootcamp.newtodolist.models;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "pedidos")
public class PedidossModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ped", nullable = false)
	private Integer id_ped;
	
	@NotNull(message = "El nombre del pedido no puede ser nulo")
	private String nombre;
	
	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DetPedidosModel> detalle;

	public Integer getId_ped() {
		return id_ped;
	}

	public void setId_ped(Integer id_ped) {
		this.id_ped = id_ped;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public List<DetPedidosModel> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetPedidosModel> detalle) {
		this.detalle = detalle;
	}

	public PedidossModel() {
		super();
	}

	public PedidossModel(Integer id_ped, String nombre) {
		super();
		this.id_ped = id_ped;
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(detalle, id_ped, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidossModel other = (PedidossModel) obj;
		return Objects.equals(detalle, other.detalle) && Objects.equals(id_ped, other.id_ped)
				&& Objects.equals(nombre, other.nombre);
	}
	
	

}
