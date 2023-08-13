package com.boot.db.SpringMongoDbDemo.repo;

import com.boot.db.SpringMongoDbDemo.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Long> {

    //findBy<Entity><Property> => custom method

    public List<Employee> findEmployeeByRegion(String region);

    public Employee findEmployeeByName(String name);

}
