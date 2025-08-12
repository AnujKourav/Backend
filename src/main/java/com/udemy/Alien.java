package com.udemy;

//import jakarta.persistence.Embeddable;

import jakarta.persistence.*;

import java.util.List;

//@Entity(name="AlienTable")
//@Table(name="Alien_Table") //we can change the table name using these two
@Entity
public class Alien {

    @Id
    private int aid;
//    @Column(name="Alien_Name") //we can change the column name using this
    private String aName;
//    @Transient //this will make it to be not stored in database table
    private String tech;
//    @OneToOne(mappedBy = "alien")
//    @ManyToMany
    @OneToMany
    private List<Laptop> laptops;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aName='" + aName + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
