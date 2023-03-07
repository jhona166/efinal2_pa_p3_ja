package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Producto;
import com.example.demo.repository.IProductoRepo;

@Service

public class ProductoServiceImpl implements IProductoService{
	@Autowired
	private IProductoRepo iProductoRepo;
	@Override
	public List<Producto> buscarProductos(String nombre, String categoria, String codigo) {
		// TODO Auto-generated method stub
		return this.iProductoRepo.buscarProductos(nombre, categoria, codigo);
	}
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepo.insertar(producto);
		
	}
	

}
