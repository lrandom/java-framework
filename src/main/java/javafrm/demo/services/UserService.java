package javafrm.demo.services;

import javafrm.demo.entity.User;
import javafrm.demo.repos.IUserRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;
   public PageResult getPagination(int page){
        List<User> users= userRepo.findAll(PageRequest.of(page-1, 10)).getContent();
        long totalRecord = userRepo.count();
       System.out.println(totalRecord);
        double totalPage = Math.round((double) totalRecord/10);
        PageResult<User> pageResult = new PageResult();
        pageResult.setTotalPage(totalPage);
        pageResult.setUsers(users);
        return pageResult;
   };



}
