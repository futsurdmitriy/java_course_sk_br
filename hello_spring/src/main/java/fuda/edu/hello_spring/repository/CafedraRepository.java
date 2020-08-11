/*
 @author Dmitriy Futsur
 @since 07 Aug 2020
 @version 1.0.0
 Copyright (c) Dmitriy Futsur
 Description:
 */

package fuda.edu.hello_spring.repository;

import fuda.edu.hello_spring.model.Cafedra;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CafedraRepository extends MongoRepository<Cafedra, String> {
}
