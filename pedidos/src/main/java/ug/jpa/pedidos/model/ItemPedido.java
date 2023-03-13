package ug.jpa.pedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name="adm_items_pedidos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedido {
   @Id
   private long numeracion;

   private int linea;
   private int cantidad;
   private double subtotal;
   

   @ManyToOne
   @JoinColumn(name="pedido_id")
   private Pedido pedido;

   @ManyToOne
   @JoinColumn(name="producto_id")
   private Producto producto;
}
