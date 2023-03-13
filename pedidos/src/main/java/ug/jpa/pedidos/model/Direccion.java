package ug.jpa.pedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Entity
@Table(name = "adm_direcciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
   @Id 
   private long codigo;
   private String descripcion;
   private String ciudad;

   @OneToOne
   @JoinColumn(name = "cliente_id")
   private Direccion direccion;
}
