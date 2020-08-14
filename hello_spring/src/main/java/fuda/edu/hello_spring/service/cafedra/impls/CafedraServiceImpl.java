package fuda.edu.hello_spring.service.cafedra.impls;

import fuda.edu.hello_spring.dao.cafedra.impls.DaoCafedraImpl;
import fuda.edu.hello_spring.datastorage.DataFake;
import fuda.edu.hello_spring.model.Cafedra;
import fuda.edu.hello_spring.repository.CafedraRepository;
import fuda.edu.hello_spring.repository.GroupRepository;
import fuda.edu.hello_spring.service.cafedra.interfaces.ICafedraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CafedraServiceImpl implements ICafedraService {

//    @Autowired
//    DaoCafedraImpl daoCafedra;

    @Autowired
    DataFake dataFake;

    @Autowired
    CafedraRepository cafedraRepository;

  /*  @Autowired
    GroupRepository groupRepository;*/

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
    public List<Cafedra> getAll() {
        return cafedraRepository.findAll();
    }


    public void refresh() {
        cafedraRepository.deleteAll();
        cafedraRepository.saveAll(dataFake.getCafedras());
        /*groupRepository.deleteAll();
        groupRepository.saveAll(dataFake.getGroups());*/
    }

//    @Override
//    public void relatedDatabase() { dataFake.init();

    @Override
    public List<Cafedra> searchByName(String str) {
        return this.getAll()
                .stream()
                .filter(item->item.getName().equals(str))
                .collect(Collectors.toList());
    }
}
