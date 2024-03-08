package com.example.easypos.service;

import com.example.easypos.model.Usuario;
import com.example.easypos.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    public ResponseEntity<String> registrarUsuario(Usuario usuario) {
        if (!usuarioRepository.exists(Example.of(usuario))) {
            Usuario usuario1 = usuarioRepository.save(usuario);
            return ResponseEntity.ok().body("Usuario registrado con éxito." + usuario1.getNombreUsuario());
        }
        return ResponseEntity.ok().body("Usuario " + usuario.getNombreUsuario() + " ya existe.");
    }
}
