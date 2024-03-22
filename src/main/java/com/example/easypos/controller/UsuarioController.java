package com.example.easypos.controller;

import com.example.easypos.model.Usuario;
import com.example.easypos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "registrar")
    public ResponseEntity<String> registrar(@RequestBody Usuario usuario) {
        return usuarioService.registrar(usuario);
    }

    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id){
        return usuarioService.eliminar(id);
    }

    @GetMapping(value = "obtener/{id}")
    public ResponseEntity<Optional<Usuario>> obtener(@PathVariable Long id){
        return usuarioService.obtener(id);
    }

    @PutMapping(value = "update/{id}")
    public ResponseEntity<String> actualizar(@RequestBody Usuario usuario){ return usuarioService.actualizar(usuario);}

}
