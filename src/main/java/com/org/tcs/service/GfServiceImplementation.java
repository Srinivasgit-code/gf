package com.org.tcs.service;

import com.org.tcs.model.Gf;
import com.org.tcs.repository.GfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GfServiceImplementation implements GfService {

    @Autowired
    private GfRepo gfRepo;

    public void create(Gf gf){
        gfRepo.save(gf);
    }

    public void update(Gf gf){
        gfRepo.save(gf);
    }

    public void deleteById(Integer id){
        gfRepo.deleteById(id);
    }

    public List<Gf> getAll(){
        return gfRepo.findAll();

    }
}
