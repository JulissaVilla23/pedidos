package ug.jpa.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ug.jpa.pedidos.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
   
}
