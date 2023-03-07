package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Producto;

public interface IProductoRepo {
	public void insertar(Producto producto);
	public List<Producto> buscarProductos(String nombre, String categoria, String codigo);
	public void ingresarInventario(String codigo, String numero,Integer cantidad);
}
