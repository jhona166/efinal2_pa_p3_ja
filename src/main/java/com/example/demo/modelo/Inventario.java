package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="inventario")
public class Inventario {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inve_sec")
	@SequenceGenerator(name = "inve_sec", sequenceName = "inve_sec", allocationSize = 1)
	@Column(name="inve_id")
	private Integer id;
	@Column(name="bode_numero")
	private String numero;
	@Column(name="bode_codigo")
	private String codigo;
	@Column(name="bode_cantidad")
	private Integer cantidad;
	
	@ManyToOne()
	@JoinColumn(name="inven_id_bodega")
	private Bodega bodega;
	
	@ManyToOne()
	@JoinColumn(name="inven_id_producto")
	private Bodega producto;
	
	
	
	
	
	public Bodega getBodega() {
		return bodega;
	}
	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}
	public Bodega getProducto() {
		return producto;
	}
	public void setProducto(Bodega producto) {
		this.producto = producto;
	}
	@Override
	public String toString() {
		return "Inventario [id=" + id + ", numero=" + numero + ", codigo=" + codigo + ", cantidad=" + cantidad + "]";
	}
	//Set and get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
