package com.example.easypos.repository;

import com.example.easypos.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaRepository extends JpaRepository<Factura, Long> {
}
