package com.devhoss.app.productos.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.devhoss.app.productos.models.Producto;
import com.devhoss.app.productos.services.IProductoService;

@RestController
public class ProductoController {
	
	    // @Autowired
		//private Environment env;
		
		//@Value("${server.port}")
		//private Integer port;
		
		@Autowired
		private IProductoService productoService;
		
		@GetMapping("/listar")
		public List<Producto> listar(){
			return productoService.findAll();
		}
		
		@GetMapping("/ver/{id}")
		public Producto detalle(@PathVariable Long id) {
			return productoService.findById(id);
		}

}
