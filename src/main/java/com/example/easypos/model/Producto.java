package com.example.easypos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PRODUCTO")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPRODUCTO")
    private Long idProducto;

    @Column(name = "NOMBREPRODUCTO")
    private String nombreProducto;

    @Column(name = "DESCRIPCIONPRODUCTO")
    private String descripcionProducto;

    @Column(name = "VALORPRODUCTO")
    private double valorProducto;

    @Column(name = "VALORVENTAPRODUCTO")
    private double valorVentaProducto;

    @Column(name = "STOCK")
    private int stock;

}
