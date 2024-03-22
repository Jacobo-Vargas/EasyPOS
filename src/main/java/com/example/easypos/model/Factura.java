package com.example.easypos.model;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "Factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDFACTURA")
    private Long idFactura;

    @ManyToOne
    @JoinColumn(name = "IDVENTA")
    private Venta idVenta;

    @ManyToOne
    @JoinColumn(name = "IDCLIENTE")
    private Cliente idCliente;

}
