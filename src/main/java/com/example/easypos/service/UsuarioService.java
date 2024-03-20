package com.example.easypos.service;

import com.example.easypos.model.Usuario;
import com.example.easypos.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    public ResponseEntity<String> registrar(Usuario usuario) {
        if (!usuarioRepository.exists(Example.of(usuario))) {
            Usuario usuario1 = usuarioRepository.save(usuario);
            return ResponseEntity.ok().body("Usuario registrado con éxito." + usuario1.getNombreUsuario());
        }
        return ResponseEntity.ok().body("Usuario " + usuario.getNombreUsuario() + " ya existe.");
    }

    public ResponseEntity<String> eliminar(Long id){
        if(usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
            return ResponseEntity.ok("Se elimino con éxito");
        } else {
            return ResponseEntity.ok("Usuario no existe.");
        }
    }

    public ResponseEntity<String> editar(Usuario usuario){
        if(usuarioRepository.existsById(usuario.getIdUsuario())){
            usuarioRepository.deleteById(usuario.getIdUsuario());
            usuarioRepository.save(usuario);
            return ResponseEntity.ok().body("Actualización completa" + usuario);
        } else {
            return ResponseEntity.ok("No se encontro el usuario");
        }
    }

    public ResponseEntity<List<Usuario>> obtenerUsuarios(){
        return ResponseEntity.ok().body(usuarioRepository.findAll());
    }
}
