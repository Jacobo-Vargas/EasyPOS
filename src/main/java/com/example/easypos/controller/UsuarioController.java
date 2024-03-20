package com.example.easypos.controller;

import com.example.easypos.model.Usuario;
import com.example.easypos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<String> delete(@PathVariable Long id){
        return usuarioService.eliminar(id);
    }

    @GetMapping(value = "obtener")
    public ResponseEntity<List<Usuario>> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }
}
