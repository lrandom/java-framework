package javafrm.demo.entity;

import lombok.Data;

import javax.persistence.*;



@Entity
@Data
@Table(name = "address")
public class Address{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "detail")
    String detail;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

}