package fuda.edu.hello_spring.dao.cafedra.interfaces;

import fuda.edu.hello_spring.model.Cafedra;

import java.util.List;

public interface IDaoCafedra {
    Cafedra create (Cafedra cafedra);
    Cafedra get (String id);
    Cafedra update (Cafedra cafedra);
    Cafedra delete (String id);
    List getAll ();
}

