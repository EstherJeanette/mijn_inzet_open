package com.mijninzet.projectteamdrie.controller;

import com.mijninzet.projectteamdrie.model.dao.AdministratorDAO;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddUserController {
    private SessionFactory sessionFactory;
    private AdministratorDAO administratorDAO = new AdministratorDAO(sessionFactory);

    @RequestMapping("addUsers")
    public String addUser(Model model) {

//        // Dit is een testje
//        List<Integer> test = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            test.add(i);
//        }
//        model.addAttribute("test", test);
//        // einde test

        return "addUsers";
    }
}
