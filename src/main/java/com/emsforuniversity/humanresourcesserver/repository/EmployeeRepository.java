package com.emsforuniversity.humanresourcesserver.repository;

import com.emsforuniversity.humanresourcesserver.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}