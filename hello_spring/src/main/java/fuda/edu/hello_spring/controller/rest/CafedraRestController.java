package fuda.edu.hello_spring.controller.rest;

import fuda.edu.hello_spring.model.Cafedra;
import fuda.edu.hello_spring.service.cafedra.impls.CafedraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RequestMapping("/api/cafedra")
@RestController
class CafedraRestController {

    public CafedraRestController(CafedraServiceImpl cafedraServiceImpl) {
        this.cafedraServiceImpl = cafedraServiceImpl;
    }

    @Autowired
    CafedraServiceImpl cafedraServiceImpl;

    @GetMapping("/hello")
    String getHello() {
        return "<h1>Hello from Cafedra Controller</h1>";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List getCafedrasList() {
        return cafedraServiceImpl.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Cafedra getCafedra(@PathVariable("id") String id) {
        return cafedraServiceImpl.get(id);
    }

}
