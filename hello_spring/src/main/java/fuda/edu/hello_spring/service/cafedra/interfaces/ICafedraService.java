package fuda.edu.hello_spring.service.cafedra.interfaces;

import fuda.edu.hello_spring.model.Cafedra;
import fuda.edu.hello_spring.service.IGenericService;

import java.util.List;

public interface ICafedraService extends IGenericService<Cafedra> {
    List <Cafedra> searchByName(String name);
}