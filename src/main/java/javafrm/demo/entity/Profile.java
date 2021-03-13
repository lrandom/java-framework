package javafrm.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "age")
    String age;

    @OneToOne
    @JoinColumn(name = "user_id")
    User user;

}
