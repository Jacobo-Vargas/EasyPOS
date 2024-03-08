package com.example.easypos.service;

import com.example.easypos.model.Usuario;
import com.example.easypos.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    public Usuario registrarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
