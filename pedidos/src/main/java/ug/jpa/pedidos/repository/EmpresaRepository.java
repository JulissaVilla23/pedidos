package ug.jpa.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ug.jpa.pedidos.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
   
}
