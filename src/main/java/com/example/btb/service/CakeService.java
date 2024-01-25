package com.example.btb.service;

import com.example.btb.model.Cake;
import com.example.btb.repository.CakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeService {
    @Autowired
    private CakeRepository cakeRepository;

    public List<Cake> getAllListCake(){
        return  (List<Cake>)cakeRepository.findAll();
    }

    public void createCake(Cake Cake) {
        cakeRepository.save(Cake);
    }

    public Cake findById(int id) {
        return cakeRepository.findById(id).get();
    }

    public void updateCake(Cake cake) {
        Cake cakeEdit = findById(cake.getId());

        if (cakeEdit != null) {
            cakeEdit.setDetails(cake.getDetails());
            cakeEdit.setPrice(cake.getPrice());
            cakeEdit.setType(cake.getType());
            cakeEdit.setStatus(cake.getStatus());

            cakeRepository.save(cakeEdit);
        }
    }
}
