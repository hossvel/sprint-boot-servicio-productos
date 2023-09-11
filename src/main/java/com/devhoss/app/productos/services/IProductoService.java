package com.devhoss.app.productos.services;

import java.util.List;

import com.devhoss.app.productos.models.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
}
