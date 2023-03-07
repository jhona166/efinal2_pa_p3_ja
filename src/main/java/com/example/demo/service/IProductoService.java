package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Producto;

public interface IProductoService {
	public List<Producto> buscarProductos(String nombre, String categoria, String codigo);
	public void insertar(Producto producto);


}
