package com.devhoss.app.productos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devhoss.app.productos.models.Producto;
import com.devhoss.app.productos.repositories.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepository iproductoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) iproductoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return iproductoRepository.findById(id).orElse(new Producto());
	}
	
	@Override
	@Transactional
	public Producto save(Producto producto) {
		return iproductoRepository.save(producto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		iproductoRepository.deleteById(id);
	}


}
