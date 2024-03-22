package com.example.easypos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCLIENTE")
    private Long idCliente;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Telefono")
    private int telefono;

    @Column(name = "CORREO")
    private String correo;
}
