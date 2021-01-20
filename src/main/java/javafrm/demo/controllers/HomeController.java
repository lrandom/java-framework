package javafrm.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "index";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @PostMapping("/receive-contact")
    public String receiveContact(@RequestParam String fullname,
                                 @RequestParam String email,
                                 @RequestParam String phone
                                 ){
        System.out.println(fullname);
        System.out.println(email);
        System.out.println(phone);
        return "redirect:/home";
    }
}
