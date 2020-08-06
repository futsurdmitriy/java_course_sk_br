package fuda.edu.hello_spring.datastorage;

import fuda.edu.hello_spring.model.Cafedra;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {

    List<Cafedra> cafedras = new LinkedList<>(Arrays.asList(
            new Cafedra("1","IPZ", "Ivanov", "Engineering"),
            new Cafedra("2","KN", "Petrov", "MSOffice"),
            new Cafedra("3","IT", "Pshek", "VoitiVIT")
    ));

    public List<Cafedra> getCafedras(){
        return cafedras;
    }
    public void setCafedras(List<Cafedra> cafedras){
        this.cafedras = cafedras;
    }
}

