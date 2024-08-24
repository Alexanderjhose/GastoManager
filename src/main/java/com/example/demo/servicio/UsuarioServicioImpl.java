/**
 * 
 */
package com.example.demo.servicio;

import java.util.Objects;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.UsuarioRepositorio;

/**
 * 
 */

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

	private final UsuarioRepositorio usuarioRepositorio;

	public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
		this.usuarioRepositorio = usuarioRepositorio;
	}

	@Transactional
	@Override
	public Usuario crearUsuario(Usuario usuario) {
		if (!Objects.isNull(usuario.getId()) || !Objects.isNull(usuario.getNombre())) {
			return usuarioRepositorio.save(usuario);
		}
		throw new IllegalArgumentException("El usuario no puede ser nulo.");
	}

}
