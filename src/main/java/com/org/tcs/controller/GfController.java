package com.org.tcs.controller;

import com.org.tcs.model.Gf;
import com.org.tcs.service.GfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GfController {

    @Autowired
    private GfService gfService;
    @PostMapping("/create")
    public void create(@RequestBody Gf gf){
        gfService.create(gf);
    }

    @PutMapping("/update")
    public void update(@RequestBody Gf gf){
        gfService.update(gf);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Integer id){
        gfService.deleteById(id);
    }

    @GetMapping("/getAll")
    public List<Gf>getAll()
    {
        return gfService.getAll();
    }
}

