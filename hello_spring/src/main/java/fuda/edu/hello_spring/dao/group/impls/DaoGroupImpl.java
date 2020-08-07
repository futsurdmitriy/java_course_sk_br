package fuda.edu.hello_spring.dao.group.impls;/*
 @author Dmitriy Futsur
 @since 07 Aug 2020
 @version 1.0.0 
 Copyright (c) Dmitriy Futsur 
 Description:
 */

import fuda.edu.hello_spring.dao.group.interfaces.IDaoGroup;
import fuda.edu.hello_spring.datastorage.DataFake;
import fuda.edu.hello_spring.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoGroupImpl implements IDaoGroup {

    @Autowired
    DataFake dataFake;

    @Override
    public Group create(Group cafedra) {
        return null;
    }

    @Override
    public Group get(String id) {
        return null;
    }

    @Override
    public Group update(Group cafedra) {
        return null;
    }

    @Override
    public Group delete(String id) {
        return null;
    }

    @Override
    public List getAll() {
        return dataFake.getGroups();
    }
}
