package com.example.easypos.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDUSUARIO")
    private Long idUsuario;

    @Column (name = "NOMBREUSUARIO")
    private String nombreUsuario;

    @Column (name = "PASSWORD")
    private String password;
}
