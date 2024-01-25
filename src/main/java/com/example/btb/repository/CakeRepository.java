package com.example.btb.repository;

import com.example.btb.model.Cake;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CakeRepository extends CrudRepository<Cake , Integer> {

}
