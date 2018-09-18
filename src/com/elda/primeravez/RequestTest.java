package com.elda.primeravez;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestTest {
	
	@RequestMapping("/")
	String raiz() {
		return "Bienvenido!!!";
	}

	@RequestMapping("saludo")
	String saludo() {
		return "¡Hola amigo!";
	}
	
	@RequestMapping("saludo/saludo2")
	String saludo2() {
		return "¡Hola amigo2222!";
	}
	
}
