package javafrm.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "username")
    String username;

    @Column(name="password")
    String password;

    //FetchType.LAZY
    //FetchType.EAGER
    @OneToOne(mappedBy = "user", fetch = FetchType.EAGER)
    Profile profile;

    @OneToMany(mappedBy = "user")
    Collection<Address> addresses;


}

