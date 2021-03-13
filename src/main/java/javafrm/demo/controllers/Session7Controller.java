package javafrm.demo.controllers;

import javafrm.demo.entity.Order;
import javafrm.demo.models.User;
import javafrm.demo.repos.IOrderRepo;
import javafrm.demo.services.PageResult;
import javafrm.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Session7Controller {
    @Autowired
    UserService userService;
    @Autowired
    IOrderRepo orderRepo;
    @RequestMapping("/list/page")
    public String page(Model model, @RequestParam(defaultValue = "1") int page){
        PageResult<User> pageResult =  userService.getPagination(page);
        //tổng số trang
        //số phần tử trang request
        //trang request
        model.addAttribute("totalPage", pageResult.getTotalPage());
        model.addAttribute("lists",pageResult.getUsers());
        model.addAttribute("activePage", page);
        return "session7/list";
    }

    @RequestMapping("/list/order")
    public String page(Model model){
        Iterable<Order> orders =  orderRepo.findAll();
        List<Order> orderTf = new ArrayList<>();
        for (Order order: orders) {
            Order newOrder = (Order)order;
            orderTf.add(newOrder);
        }
        model.addAttribute("orders", orderTf);
        return "session7/orders";
    }
}
