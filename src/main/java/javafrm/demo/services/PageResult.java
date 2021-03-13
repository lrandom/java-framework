package javafrm.demo.services;

import javafrm.demo.entity.User;
import lombok.Data;

import java.util.List;

@Data
public class PageResult<T>{
    List<T> users;
    Double totalPage;

}
