package ug.jpa.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ug.jpa.pedidos.model.Direccion;

public interface DireccionRepository extends JpaRepository<Direccion, Long>{
   
}
