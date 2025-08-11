package com.udemy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.event.internal.AbstractSaveEventListener;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollno(106);
        s1.setsName("Avni");
        s1.setSage(22);

//        Student s2 = null;

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.udemy.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

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
        Transaction transaction = session.beginTransaction();
        Student s2 = new Student();
        s2 = session.find(Student.class,106);
        session.remove(s2);
        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s1);

    }
}