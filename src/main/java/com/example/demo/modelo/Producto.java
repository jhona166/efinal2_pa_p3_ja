package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
@NamedQuery(name="buscarProductos",query="SELECT e Productos e WHERE e.producto e JOIN e.nombre=:datoNombre e.codigo=:datoCodigo  e.categoria=:datoCategoria")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_sec")
	@SequenceGenerator(name = "prod_sec", sequenceName = "prod_sec", allocationSize = 1)
	@Column(name="prod_id")
	private Integer id;
	@Column(name="bode_nombre")
	private String nombre;
	@Column(name="bode_codigo")
	private String codigo;
	@Column(name="bode_categoria")
	private String categoria;
	
	@OneToMany(mappedBy="producto")
	private List<Inventario> inventarios;
	
	
	
	
	
	
	public List<Inventario> getInventarios() {
		return inventarios;
	}
	public void setInventarios(List<Inventario> inventarios) {
		this.inventarios = inventarios;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", categoria=" + categoria + "]";
	}
	//Set and Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
