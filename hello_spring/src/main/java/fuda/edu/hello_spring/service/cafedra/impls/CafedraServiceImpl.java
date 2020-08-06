package fuda.edu.hello_spring.service.cafedra.impls;

import fuda.edu.hello_spring.model.Cafedra;
import fuda.edu.hello_spring.service.cafedra.interfaces.ICafedraService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service
public class CafedraServiceImpl implements ICafedraService {

    List<Cafedra> cafedras = new LinkedList<>(Arrays.asList(
            new Cafedra("IPZ", "Ivanov", "Engineering"),
            new Cafedra("KN", "Petrov", "MSOffice"),
            new Cafedra("IT", "Pshek", "VoitiVIT")

    ));

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
        return cafedras;
    }
}
