package ug.jpa.pedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "adm_productos")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Producto {
   @Id
   private long codigo;
   private String descripcion;
   private double precio;
   private int stock;
   
}
