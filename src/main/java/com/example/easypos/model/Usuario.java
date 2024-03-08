package com.example.easypos.model;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDUSUARIO")
    private Long idUsuario;

    @Column (name = "NOMBREUSUARIO", unique = true)
    private String nombreUsuario;

    @Column (name = "PASSWORD")
    private String password;
}
