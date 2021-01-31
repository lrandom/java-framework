package javafrm.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Session3 {

    @GetMapping("/session3/set-cookie")
    public String setCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("SCHOOL", "NIIT");
        response.addCookie(cookie);

        Cookie cookie1 = new Cookie("SCHOOL_2", "HVQLGD");
        response.addCookie(cookie1);
        return "session3/set-cookie";
    }

    @GetMapping("/session3/get-cookie")
    public String getCookie(@CookieValue(value = "SCHOOL") String cookieName, Model model) {
        model.addAttribute("SCHOOL_NAME", cookieName);
        return "session3/get-cookie";
    }


    @GetMapping("/session3/get-all-cookie")
    public String getAllCookie(HttpServletRequest request,Model model){
        Cookie[] cookies =  request.getCookies();
        model.addAttribute("ALL_COOKIES", cookies);
        //cookies[0].get
        return "session3/get-all-cookie";
    }

    @GetMapping("/session3/remove-cookie")
    public String removeCookie(HttpServletResponse response,HttpServletRequest request){
        Cookie[] cookies =  request.getCookies();
        Cookie cookie = null;
        for (int i = 0; i < cookies.length ; i++) {
           if(cookies[i].getName().equals("SCHOOL")){
               cookie = cookies[i];
               break;
           }
        }

        if(cookie!=null){
            cookie.setMaxAge(0); //xoá cookie
        }

        response.addCookie(cookie);

        return "session3/remove-cookie";
    }
}
