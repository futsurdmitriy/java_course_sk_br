package fuda.edu.hello_spring.controller.web;

import com.fasterxml.jackson.annotation.JsonView;
import fuda.edu.hello_spring.datastorage.DataFake;
import fuda.edu.hello_spring.form.CafedraForm;
import fuda.edu.hello_spring.model.Cafedra;
import fuda.edu.hello_spring.service.cafedra.impls.CafedraServiceImpl;
import fuda.edu.hello_spring.service.cafedra.interfaces.ICafedraService;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/web/cafedra")
public class CafedraWebController {

    @Autowired
    CafedraServiceImpl cafedraService;
    @Autowired
    DataFake dataFake;

    @RequestMapping("/list")
    String showAll(Model model) {
        model.addAttribute("list", cafedraService.getAll());


        return "cafedralist";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteCafedra(@PathVariable("id") String id, Model model) {
        cafedraService.delete(id);
        model.addAttribute("list", cafedraService.getAll());
        return "redirect:/web/cafedra/list";
    }

    @RequestMapping(value = "/refresh", method = RequestMethod.GET)
    String refreshCafedra() {
        cafedraService.refresh();
        return "redirect:/web/cafedra/list";
    }

    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    String infoCafedra(@PathVariable("id") String id, Model model){
//        model.addAttribute("objectName", cafedraService.get(id).toJSON());
        return cafedraService.get(id).toJSON();
//        return "mytest";
//        return JsonView.Render(model, response);
//        cafedraService.get(id).getName().toJ;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createCafedra(Model model) {
        CafedraForm cafedraForm = new CafedraForm();
        model.addAttribute("cafedraForm", cafedraForm);
        return "addCafedra";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createCafedra(Model model, @ModelAttribute("cafedraForm") CafedraForm cafedraForm){
        Cafedra cafedra = new Cafedra();
        cafedra.setName(cafedraForm.getName());
        cafedra.setDesc(cafedraForm.getDesc());
        cafedra.setChief(cafedraForm.getChief());
        cafedraService.create(cafedra);

        model.addAttribute("cafedras", cafedraService.getAll());
        return "redirect:/web/cafedra/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateCafedra(@PathVariable("id") String id,Model model) {
        Cafedra cafedra = cafedraService.get(id);
        CafedraForm cafedraForm = new CafedraForm(
                cafedra.getId(),
                cafedra.getName(),
                cafedra.getDesc(),
                cafedra.getChief()
        );
        model.addAttribute("cafedraForm", cafedraForm);
        return "updateCafedra";
    }
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateCafedra(Model model,@PathVariable("id") String id, @ModelAttribute("cafedraForm") CafedraForm cafedraForm){
        Cafedra cafedra = cafedraService.get(id);
        cafedra.setName(cafedraForm.getName());
        cafedra.setDesc(cafedraForm.getDesc());
        cafedra.setChief(cafedraForm.getChief());
        cafedraService.update(cafedra);

        model.addAttribute("cafedras", cafedraService.getAll());
        return "redirect:/web/cafedra/list";
    }

}
