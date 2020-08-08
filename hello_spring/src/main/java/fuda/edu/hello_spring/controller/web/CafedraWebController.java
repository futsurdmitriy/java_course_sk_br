package fuda.edu.hello_spring.controller.web;

import fuda.edu.hello_spring.service.cafedra.impls.CafedraServiceImpl;
import fuda.edu.hello_spring.service.cafedra.interfaces.ICafedraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/cafedra")
public class CafedraWebController {

    @Autowired
    CafedraServiceImpl cafedraService;

    @RequestMapping("/list")
    String showAll(Model model){
        model.addAttribute("list", cafedraService.getAll());


        return "cafedralist";
    }



}
