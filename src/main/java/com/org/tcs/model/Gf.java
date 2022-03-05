package com.org.tcs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Gf {
    @Id
    private int id;
    private String gfName;
    private String city;
    private int phNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGfName() {
        return gfName;
    }

    public void setGfName(String gfName) {
        this.gfName = gfName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhNo() {
        return phNo;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }
}
