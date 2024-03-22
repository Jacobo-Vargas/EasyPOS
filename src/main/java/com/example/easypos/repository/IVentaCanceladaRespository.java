package com.example.easypos.repository;

import com.example.easypos.model.VentaCancelada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaCanceladaRespository extends JpaRepository<VentaCancelada, Long> {
}
