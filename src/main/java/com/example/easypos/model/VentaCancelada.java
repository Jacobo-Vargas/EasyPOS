package com.example.easypos.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "VentaCancelada")
public class VentaCancelada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDVENTACANCELADA" )
    private Long idVentaCancelada;

    @Column(name = "IDVENTA")
    private Long idVenta;

    @Column(name = "MOTIVOCANCELACION")
    private String motivoCancelacion;

    @Column(name = "FECHA")
    private Date fecha;
}
