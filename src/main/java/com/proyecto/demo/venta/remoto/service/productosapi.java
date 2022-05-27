package com.proyecto.demo.venta.remoto.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ventas", url = "http://127.0.0.1:8085")
public interface productosapi {
	
	@GetMapping("/productos")
	ResponseEntity<?> getallproductos();

}
