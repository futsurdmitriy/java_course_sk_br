package fuda.edu.hello_spring.service.cafedra.interfaces;

import fuda.edu.hello_spring.model.Cafedra;

import java.util.List;

public interface ICafedraService {
    Cafedra create (Cafedra cafedra);
    Cafedra get (String id);
    Cafedra update (Cafedra cafedra);
    Cafedra delete (String id);
    List getAll ();
}
