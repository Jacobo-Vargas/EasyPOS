package com.example.easypos.model;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "Usuario")
public class Usuario {

    @Id
    @Column(name = "NUMERODOCUMENTO", unique = true)
    private Long numeroDocumento;

    @Column (name = "NOMBREUSUARIO", unique = true)
    private String nombreUsuario;

    @Column (name = "CORREO", unique = true)
    private String correo;

    @Column (name = "PASSWORD")
    private String password;

    @Column (name = "ROL")
    private String rol;
}
