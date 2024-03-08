package com.example.easypos.model;

import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPEDIDO")
    private Long idPedido;

    @Column(name = "FECHAPEDIDO")
    private Date fechaPedido;

    @ManyToOne
    @JoinColumn(name = "IDUSUARIO")
    private Usuario idUsuario;
}
