package com.udemy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int rollno;
    private String sName;
    private int sage;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", sName='" + sName + '\'' +
                ", sage=" + sage +
                '}';
    }
}
