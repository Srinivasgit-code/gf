package com.org.tcs.service;

import com.org.tcs.model.Gf;

import java.util.List;

public interface GfService {

    public void create(Gf gf);

    public void update(Gf gf);

    public void deleteById(Integer id);

    public List<Gf> getAll();
}
