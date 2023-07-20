package feljac.tech.orderservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_order_items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderedItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private Double price;
    private Integer quantity;
}
