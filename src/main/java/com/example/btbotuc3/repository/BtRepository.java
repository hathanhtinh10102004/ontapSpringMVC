package com.example.btbotuc3.repository;

import com.example.btbotuc3.model.Bt;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BtRepository {
    List<Bt> BtList = new ArrayList<>();
    public BtRepository(){
        Bt bt = new Bt(1,"banh trung 1", "vuong", 20000, true);
        Bt bt1 = new Bt(2,"banh trung 2", "tron", 30000, true);
        Bt bt2 = new Bt(3,"banh trung 3", "meo", 40000, false);
        Bt bt3 = new Bt(4,"banh trung 4", "tron", 50000, true);

        BtList.add(bt);
        BtList.add(bt1);
        BtList.add(bt2);
        BtList.add(bt3);
    }
    public List<Bt> getBtList(){
        return BtList;
    }
    public void createBt(Bt bt){
        BtList.add(bt);
    }
    public Bt getBtById(int id){
        for (Bt bt: BtList) {
            if (bt.getId() == id){
                return bt;
            }
        }
        return null;
    }
    public void updateBt(Bt bt){
        Bt btEdit = getBtById(bt.getId());
        btEdit.setDetail(bt.getDetail());
        btEdit.setType(bt.getType());
        btEdit.setPrice(bt.getPrice());
        btEdit.setStatus(bt.isStatus());
    }

    public void deleteBt(int id){
        BtList.remove(id);
    }
}
