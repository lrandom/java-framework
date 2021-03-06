package javafrm.demo.controllers;

import javafrm.demo.entity.User;
import javafrm.demo.repos.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class Session6Controller {
    @Autowired
    IUserRepo iUserRepo;

    @RequestMapping("list-all")
    public String listAll(Model model){
        Iterable it= this.iUserRepo.findAll();
        ArrayList<User> userLists = new ArrayList<>();
        for (Object user: it
             ) {
            userLists.add((User)user);
        }

        model.addAttribute("users", userLists );
        return "session6/list";
    }

}
