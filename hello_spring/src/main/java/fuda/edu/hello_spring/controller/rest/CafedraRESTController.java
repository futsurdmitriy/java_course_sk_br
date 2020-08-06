package fuda.edu.hello_spring.controller.rest;

import fuda.edu.hello_spring.model.Cafedra;
import fuda.edu.hello_spring.service.cafedra.impls.CafedraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RestController
class CafedraRestController {

    @Autowired
    CafedraServiceImpl cafedraServiceImpl;

    @RequestMapping("/hello")
    String getHello() {
        return "<h1>Hello from Cafedra Controller</h1>d" +
                "";
    }

    @GetMapping("/cafedra/list")
    List getCafedrasList() {
        return cafedraServiceImpl.getAll();
    }


}
