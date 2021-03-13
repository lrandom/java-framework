package javafrm.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "total")
    Float total;

    @Column(name = "sub_total")
    Float subTotal;

    @ManyToMany(mappedBy = "orders")
    Collection<Product> products;
}