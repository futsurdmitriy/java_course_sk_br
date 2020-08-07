package fuda.edu.hello_spring.service.group.impls;/*
 @author Dmitriy Futsur
 @since 07 Aug 2020
 @version 1.0.0 
 Copyright (c) Dmitriy Futsur 
 Description:
 */

import fuda.edu.hello_spring.dao.group.impls.DaoGroupImpl;
import fuda.edu.hello_spring.model.Group;
import fuda.edu.hello_spring.service.group.interfaces.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements IGroupService {

    @Autowired
    DaoGroupImpl daoGroup;

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
        return daoGroup.getAll();
    }

}
