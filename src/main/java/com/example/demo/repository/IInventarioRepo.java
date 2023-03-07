package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Inventario;
import com.example.demo.modelo.Producto;

public interface IInventarioRepo {
public List<Inventario> crear(Producto producto);
}
