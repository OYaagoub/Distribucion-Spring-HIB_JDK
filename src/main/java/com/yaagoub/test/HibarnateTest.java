package com.yaagoub.test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibarnateTest {
    public static void main(String[] args){
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("OSM");
        EntityManager em = enf.createEntityManager();
        System.out.println("hola");
        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
    }
}
