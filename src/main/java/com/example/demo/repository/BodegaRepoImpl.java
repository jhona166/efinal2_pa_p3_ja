package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Bodega;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BodegaRepoImpl implements IBodegaRepo {
  @PersistenceContext
  private EntityManager entityManager;

@Override
public void insertar(Bodega bodega) {
	// TODO Auto-generated method stub
	this.entityManager.persist(bodega);
}

@Override
public Bodega buscarBodega(String nombre) {
	// TODO Auto-generated method stub
	TypedQuery<Bodega> MyQuery = this.entityManager.createQuery("SELECT e Bodega e Where e.nombre=datoNombre",Bodega.class);
	MyQuery.setParameter("datoNombre",nombre);
	return MyQuery.getSingleResult();
}
  
	
}
