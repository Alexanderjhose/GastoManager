/**
 * 
 */
package com.example.demo.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuario;
import com.example.demo.servicio.UsuarioServicioImpl;

/**
 * 
 */

@RestController
@RequestMapping("/gestorGastos")
public class UsuarioControlador {

	private final UsuarioServicioImpl usuarioServicioImpl;

	public UsuarioControlador(UsuarioServicioImpl usuarioServicioImpl) {
		this.usuarioServicioImpl = usuarioServicioImpl;
	}

	@PostMapping("/usuario")
	public ResponseEntity<Usuario> crearUsuario(@RequestBody @Validated Usuario usuario) {
		Usuario registroUsuario = usuarioServicioImpl.crearUsuario(usuario);
		return new ResponseEntity<>(registroUsuario, HttpStatus.CREATED);
	}

}
