/*
 @author Dmitriy Futsur
 @since 07 Aug 2020
 @version 1.0.0
 Copyright (c) Dmitriy Futsur
 Description:
 */

package fuda.edu.hello_spring.dao.group.interfaces;

import fuda.edu.hello_spring.model.Cafedra;
import fuda.edu.hello_spring.model.Group;

import java.util.List;

public interface IDaoGroup {
    Group create (Group cafedra);
    Group get (String id);
    Group update (Group cafedra);
    Group delete (String id);
    List getAll ();
}
