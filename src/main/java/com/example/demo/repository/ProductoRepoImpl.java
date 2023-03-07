package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepo{
  @PersistenceContext
  private EntityManager entityManager;

  public void insertar(Producto producto) {
	// TODO Auto-generated method stub
	this.entityManager.persist(producto);
}
  @Override
  public List<Producto> buscarProductos(String nombre, String categoria, String codigo) {
	TypedQuery<Producto> myQuery = this.entityManager.createNamedQuery("buscarProducto", Producto.class);

	myQuery.setParameter("datoNombre",nombre);
	myQuery.setParameter("datoCategoria", categoria);
	myQuery.setParameter("datoCodigo", codigo);
	List<Producto> productos = myQuery.getResultList();
	for (Producto producto : productos) {
		producto.getNombre();
	}
	return productos;
	
}
@Override
public void ingresarInventario(String codigo, String numero, Integer cantidad) {
	// TODO Auto-generated method stub
	this.entityManager.persist(codigo);
}
}

