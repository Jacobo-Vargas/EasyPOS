package com.example.easypos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "DetalleVenta")
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDDETALLEVENTA")
    private Long idDetalleVenta;

    @ManyToOne
    @Column(name = "IDPRODUCTO")
    private Producto idProducto;

    @Column(name = "CANTIDAD")
    private int cantidad;

    @Column(name  = "VALORTOTAL")
    private double valorTotal;
}
