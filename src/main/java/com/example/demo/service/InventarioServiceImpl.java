package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Producto;
import com.example.demo.repository.IBodegaRepo;
import com.example.demo.repository.IInventarioRepo;
import com.example.demo.repository.IProductoRepo;

@Service
public class InventarioServiceImpl implements IInventarioService{
	@Autowired
	private IProductoRepo iProductoRepo;
	@Autowired
	private IInventarioRepo iInventarioRepo;
	@Autowired
	private IBodegaRepo iBodegaRepo;

	
	@Override
	public void ingresarInventario(String codigo, String numero, Integer cantidad) {
		// TODO Auto-generated method stub
		Bodega bodega = this.iBodegaRepo.buscarBodega(numero);
		Producto producto = new Producto();
		producto.setNombre("Aceite");
		producto.setCategoria("Varios");
		producto.setCodigo("C");
		this.iProductoRepo.insertar(producto);
		
	}

}
