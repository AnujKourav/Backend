package com.udemy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.event.internal.AbstractSaveEventListener;
import org.hibernate.query.Query;

import java.io.ObjectInputFilter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //for level 2 cache
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.udemy.Laptop.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Laptop laptop = session.find(Laptop.class,101);
        System.out.println(laptop);

        session.close();

        Session session1 = sf.openSession();
        Laptop laptop1 = session1.find(Laptop.class,102);
        System.out.println(laptop1);
        session1.close();


        sf.close();


//HQL
//        for saving the data we need to create object
//        Laptop l1 = new Laptop();
//        l1.setLid(104);
//        l1.setBrand("Asus");
//        l1.setModel("Strix ");
//        l1.setRam(32);

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.udemy.Laptop.class);
//        cfg.configure();
//
//        SessionFactory sf = cfg.buildSessionFactory();
//        Session session = sf.openSession();
//
//        //for saving the data
////        Transaction transaction = session.beginTransaction();
////        session.persist(l1);
////        transaction.commit();
//
//        //for fetching the data
////        Laptop l1 = session.find(Laptop.class,103);
////        System.out.println(l1);
//
////        for fetching the data not from primary field
////        select * from laptop where ram=32 -> SQL
////        from Laptop where ram=32 -> HQL
////        for that we need to write query
//        Query query = session.createQuery("from Laptop");
//        List<Laptop> laptops = query.getResultList();
//        System.out.println(laptops);
//
//        session.close();
//        sf.close();

//Embeddable
        //relationships : one to one , one to many, many to many
//        Laptop l1 = new Laptop();
//        l1.setLid(101);
//        l1.setBrand("Asus");
//        l1.setModel("Rog");
//        l1.setRam(16);
//
//        Laptop l2 = new Laptop();
//        l2.setLid(102);
//        l2.setBrand("Dell");
//        l2.setModel("XPS");
//        l2.setRam(32);
//
//        Laptop l3 = new Laptop();
//        l3.setLid(103);
//        l3.setBrand("Apple");
//        l3.setModel("Macbook air");
//        l3.setRam(8);
//
//        Alien a1 = new Alien();
//        a1.setAid(1);
//        a1.setaName("Anuj");
//        a1.setTech("Java");
//
//        Alien a2 = new Alien();
//        a2.setAid(2);
//        a2.setaName("Somi");
//        a2.setTech("MERN");
//
////        Alien a3 = new Alien();
////        a3.setAid(9 );
////        a3.setaName("Akash");
////        a3.setTech("Python");
//
//        a1.setLaptops(Arrays.asList(l1,l2));
//        a2.setLaptops(Arrays.asList(l3));
////        a3.setLaptops(Arrays.asList(l1));
//
////        l1.setAliens(Arrays.asList(a1,a2));
////        l2.setAliens(Arrays.asList(a2,a3));
////        l3.setAliens(Arrays.asList(a2));
//
//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.udemy.Alien.class);
//        cfg.addAnnotatedClass(com.udemy.Laptop.class);
//        cfg.configure();
//
//        SessionFactory sf = cfg.buildSessionFactory();
//        Session session = sf.openSession();
//
//        Transaction transaction = session.beginTransaction();
//        session.persist(l1);
//        session.persist(l2);
//        session.persist(l3);
//        session.persist(a1);
//        session.persist(a2);
////        session.persist(a3);
//        transaction.commit();
//
////        System.out.println(a1);
//
//        Alien a5 = session.find(Alien.class,1 );
//        System.out.println(a5);
//
//        session.close();
//        sf.close();

//        Alien a1 = new Alien();
//        a1.setAid(1);
//        a1.setaName("Anuj");
//        a1.setTech("Java");
//
//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.udemy.Alien.class);
//        cfg.configure();
//
//        SessionFactory sf = cfg.buildSessionFactory();
//        Session session = sf.openSession();
//
//        Transaction transaction = session.beginTransaction();
//        session.persist(a1);
//        transaction.commit();
//
//        session.close();
//        sf.close();


//        Student s1 = new Student();
//        s1.setRollno(106);
//        s1.setsName("Avni");
//        s1.setSage(22);

//        Student s2 = null;

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.udemy.Student.class);
//        cfg.configure();

//        SessionFactory sf = cfg.buildSessionFactory();
//        Session session = sf.openSession();

//        for inserting the data
//        Transaction transaction = session.beginTransaction();
//        session.persist(s1);
//        transaction.commit();

//        for fetching the data
//        s2 = session.find(Student.class,104);

//        for updating the data
//        Transaction transaction = session.beginTransaction();
//        session.merge(s1);
//        transaction.commit();

//        for deleting the data
//        Transaction transaction = session.beginTransaction();
//        session.remove(s1);
//        transaction.commit();

//        fetch and delete if you don't have object, with the help of primary key fetch it first
//        Transaction transaction = session.beginTransaction();
//        Student s2 = new Student();
//        s2 = session.find(Student.class,106);
//        session.remove(s2);
//        transaction.commit();
//
//        session.close();
//        sf.close();
//
//        System.out.println(s1);

    }
}