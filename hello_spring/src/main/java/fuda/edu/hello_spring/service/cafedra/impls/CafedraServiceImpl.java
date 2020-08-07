package fuda.edu.hello_spring.service.cafedra.impls;

import fuda.edu.hello_spring.dao.cafedra.impls.DaoCafedraImpl;
import fuda.edu.hello_spring.model.Cafedra;
import fuda.edu.hello_spring.repository.CafedraRepository;
import fuda.edu.hello_spring.service.cafedra.interfaces.ICafedraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CafedraServiceImpl implements ICafedraService {

//    @Autowired
//    DaoCafedraImpl daoCafedra;

    @Autowired
    CafedraRepository cafedraRepository;

    @Override
    public Cafedra create(Cafedra cafedra) {
        cafedra.setCreatedAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public Cafedra get(String id) {
        return cafedraRepository.findById(id).orElse(null);
    }

    @Override
    public Cafedra update(Cafedra cafedra) {
        cafedra.setModified(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public Cafedra delete(String id) {
        Cafedra cafedra = this.get(id);
        cafedraRepository.deleteById(cafedra.getId());
        return cafedra;
    }

    @Override
    public List getAll() {
        return cafedraRepository.findAll();
    }
}
