package com.example.btbotuc3.service;


import com.example.btbotuc3.model.Bt;
import com.example.btbotuc3.repository.BtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BtService {
    @Autowired
    private BtRepository btRepository;
    public List<Bt> getBtList(){
        return btRepository.getBtList();
    }

    public void createBt(Bt bt){
        btRepository.createBt(bt);
    }

    public Bt getBtById(int id){
        return btRepository.getBtById(id);
    }

    public void updateBt(Bt bt){
        btRepository.updateBt(bt);
    }
    public void deleteBt(int id){
        btRepository.deleteBt(id);
    }
}
