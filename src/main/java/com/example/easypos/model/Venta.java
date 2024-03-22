package com.example.easypos.model;

import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "Venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDVENTA" )
    private Long idVenta;

    @Column(name = "FECHAVENTA")
    private Date fechaVenta;

    @ManyToOne
    @JoinColumn(name = "IDUSUARIO")
    private Usuario idUsusario;

    @Column(name = "TOTALVENTA")
    private long totalVenta;
}
