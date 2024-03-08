package com.example.easypos.controller;

import com.example.easypos.model.Usuario;
import com.example.easypos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> crear(@RequestBody Usuario usuario) {
        System.out.println("Entró");
        return usuarioService.registrarUsuario(usuario);
    }
}
