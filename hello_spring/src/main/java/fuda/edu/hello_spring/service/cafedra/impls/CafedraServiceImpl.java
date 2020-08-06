package fuda.edu.hello_spring.service.cafedra.impls;

import fuda.edu.hello_spring.dao.cafedra.impls.DaoCafedraImpl;
import fuda.edu.hello_spring.model.Cafedra;
import fuda.edu.hello_spring.service.cafedra.interfaces.ICafedraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CafedraServiceImpl implements ICafedraService {

    @Autowired
    DaoCafedraImpl daoCafedra;

    @Override
    public Cafedra create(Cafedra cafedra) {
        return null;
    }

    @Override
    public Cafedra get(String id) {
        return null;
    }

    @Override
    public Cafedra update(Cafedra cafedra) {
        return null;
    }

    @Override
    public Cafedra delete(String id) {
        return null;
    }

    @Override
    public List getAll() {
        return daoCafedra.getAll();
    }
}
