package com.devhoss.app.productos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.devhoss.app.productos.models.Producto;

public interface IProductoRepository extends CrudRepository<Producto, Long>{

}
