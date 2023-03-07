package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Inventario;
import com.example.demo.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class InventarioRepoImpl implements IInventarioRepo{
  @PersistenceContext
  private EntityManager entityManager;

@Override
public List<Inventario> crear(Producto producto) {
	// TODO Auto-generated method stub
	return null;
}
  
	
}
