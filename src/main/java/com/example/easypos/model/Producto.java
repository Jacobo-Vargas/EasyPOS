package com.example.easypos.model;


import lombok.Data;
import javax.persistence.*;

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

    @Column(name = "CANTIDADPRODUCTO")
    private int cantidadProducto;

    @Column(name = "VALORPRODUCTO")
    private double valorProducto;

    @Column(name = "VALORVENTAPRODUCTO")
    private double valorVentaProducto;

}
