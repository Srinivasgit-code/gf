package com.org.tcs.repository;

import com.org.tcs.model.Gf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GfRepo extends JpaRepository <Gf,Integer>{
}
