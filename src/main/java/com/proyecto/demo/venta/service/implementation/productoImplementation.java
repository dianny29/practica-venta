package com.proyecto.demo.venta.service.implementation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.proyecto.demo.venta.remoto.service.productosapi;
import com.proyecto.demo.venta.service.productoService;

@Service
public class productoImplementation implements productoService {
	@Autowired
	productosapi productosapi; 
	
	@Override
	public ResponseEntity<?> getProductos(){
		try {
			ArrayList<?> response = (ArrayList<?>) productosapi.getallproductos().getBody();
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Error:"+e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
								
	}
}
