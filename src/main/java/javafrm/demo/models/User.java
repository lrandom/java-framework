package javafrm.demo.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    public String name;
    public String address;


}
