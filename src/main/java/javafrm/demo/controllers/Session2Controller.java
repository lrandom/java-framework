package javafrm.demo.controllers;

import javafrm.demo.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Session2Controller {
    @GetMapping("/session2/load-view")
    public String loadView(Model model){
        model.addAttribute("greeting","Xin chao");

        User user = new User();
        user.address = "QN";
        user.name = "Nguyen Thanh Luan";

        model.addAttribute("user", user);

        String[] languages = new String[]{
                "PHP",
                "JAVA",
                "JS",
                "CSS"
        };
        model.addAttribute("languages",languages);
        return "session2/demo-view";
    }


    @PostMapping("/session2/handling-form")
    public String handlingForm(User user,Model model){
        model.addAttribute("user", user);
        return "session2/show-data";
    }

    @GetMapping("/session2/show-form")
    public String showForm(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "session2/form";
    }
}
