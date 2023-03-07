package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Inventario;
import com.example.demo.modelo.Producto;
import com.example.demo.service.IProductoService;


@Controller
@RequestMapping("/bodega")
public class BodegaController {
	@Autowired
	IProductoService iProductoService;
	
	
	@GetMapping("/buscaProducto")
	public String buscarInventario(Producto producto, Model modelo) {
		
		List<Producto> productos = this.iProductoService.buscarProductos(producto.getNombre(), producto.getCodigo(), producto.getCategoria());
		modelo.addAttribute("productos", producto);
		return "vistaProductos";
		
	}
	
	

	
	
	

}
