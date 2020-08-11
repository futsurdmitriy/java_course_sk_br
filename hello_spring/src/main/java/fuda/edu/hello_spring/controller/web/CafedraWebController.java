package fuda.edu.hello_spring.controller.web;

import fuda.edu.hello_spring.datastorage.DataFake;
import fuda.edu.hello_spring.form.CafedraForm;
import fuda.edu.hello_spring.service.cafedra.impls.CafedraServiceImpl;
import fuda.edu.hello_spring.service.cafedra.interfaces.ICafedraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/web/cafedra")
public class CafedraWebController {

    @Autowired
    CafedraServiceImpl cafedraService;
    @Autowired
    DataFake dataFake;

    @RequestMapping("/list")
    String showAll(Model model){
        model.addAttribute("list", cafedraService.getAll());


        return "cafedralist";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteCafedra(@PathVariable("id") String id, Model model){
        cafedraService.delete(id);
        model.addAttribute("list",cafedraService.getAll());
        return "redirect:/web/cafedra/list";
    }

    @RequestMapping(value = "/refresh", method = RequestMethod.GET)
    String refreshCafedra(){
        cafedraService.refresh();
        return "redirect:/web/cafedra/list";
    }

   /* @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    String infoCafedra(@PathVariable("id") String id, Model model){
        model.addAttribute("objectName", cafedraService.get(id).getName());
        return "mytest";
    }*/

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String createCafedra(){
//        cafedraService.create();
        return "redirect:/web/cafedra/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createCafedra(Model model){
        CafedraForm cafedraForm = new CafedraForm();
        model.addAttribute("cafedraForm", cafedraForm);
        return "addCafedra";
    }

}
