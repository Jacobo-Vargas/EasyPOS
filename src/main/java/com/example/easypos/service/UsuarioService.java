package com.example.easypos.service;

import com.example.easypos.model.Usuario;
import com.example.easypos.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    public ResponseEntity<String> registrar(Usuario usuario) {
        if (!usuarioRepository.existsById(usuario.getNumeroDocumento())) {
            Usuario usuarioGuardado = usuarioRepository.save(usuario);
            return ResponseEntity.ok().body("Usuario registrado con éxito. Nombre de usuario: " + usuarioGuardado.getNombreUsuario());
        }
        return ResponseEntity.ok().body("El usuario con número de documento " + usuario.getNumeroDocumento() + " ya existe.");
    }

    public ResponseEntity<String> eliminar(Long numeroDocumento){
        if(usuarioRepository.existsById(numeroDocumento)){
            try {
                usuarioRepository.deleteById(numeroDocumento);
                return ResponseEntity.ok("Usuario eliminado con éxito.");
            } catch (Exception e) {
                return ResponseEntity.ok("Error al eliminar usuario.");
            }
        } else {
            return ResponseEntity.ok("El usuario con número de documento " + numeroDocumento + " no existe.");
        }
    }

    public ResponseEntity<String> actualizar(Usuario usuario){
        if(usuarioRepository.existsById(usuario.getNumeroDocumento())){
            Usuario usuarioActualizado = usuarioRepository.save(usuario);
            return ResponseEntity.ok().body("Usuario actualizado con éxito. Nombre de usuario: " + usuarioActualizado.getNombreUsuario());
        } else {
            return ResponseEntity.ok("El usuario con número de documento " + usuario.getNumeroDocumento() + " no se encontró.");
        }
    }

    public ResponseEntity<Optional<Usuario>> obtener(Long id){
        return ResponseEntity.ok().body(usuarioRepository.findById(id));
    }

}
