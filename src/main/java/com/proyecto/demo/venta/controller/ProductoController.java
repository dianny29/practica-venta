package com.proyecto.demo.venta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.demo.venta.service.implementation.productoImplementation;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.PATCH})
@RequestMapping("/ventas")
public class ProductoController {
	@Autowired
	productoImplementation service;
	
	@GetMapping(value = "/productos", produces = "application/json")
	@ApiOperation(value = "Obtiene la lista de productos", notes = "Consumo de servicio externo para obtener el listado de productos")
	public Object getProductos() {
		return service.getProductos();
	}

}
