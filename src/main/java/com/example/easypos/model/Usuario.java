package com.example.easypos.model;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idUsuario;

    private String nombreUsuario;

    private String password;
}
