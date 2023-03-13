package ug.jpa.pedidos.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name="adm_pedidos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
   @Id
   private long numero;
   private LocalDate fecha;
   private double subtotal;
   private double iva;
   private double descuento;
   private double total;

   @ManyToOne
   @JoinColumn(name = "empresa_id")
   Empresa empresa;

   @ManyToOne
   @JoinColumn(name = "cliente_id")
   Cliente cliente;

   @OneToMany(mappedBy="pedido")
   List<ItemPedido> articulosList;


}
