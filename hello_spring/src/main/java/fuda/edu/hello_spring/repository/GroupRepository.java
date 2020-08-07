package fuda.edu.hello_spring.repository;

import fuda.edu.hello_spring.model.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Group, String> {
}
