package com.yaagoub.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ImplementsDAO implements DAO{
    private EntityManagerFactory em;
    private EntityManager emf;
    public ImplementsDAO() {


        this.em = Persistence.createEntityManagerFactory("OSM");

    }

    @Override
    public List<Object> getData(String nameObjectClass) {
        this.emf = this.em.createEntityManager();
        String sql ="from "+nameObjectClass+" d";
        List<Object> x=this.emf.createQuery(sql).getResultList();
        emf.close();
        return x;
    }

    @Override
    public void update(Object x) {
        this.emf = this.em.createEntityManager();

        if (x != null) {
            // Begin transaction and update the employee
            emf.getTransaction().begin();

            emf.merge(x); // Use merge() for updates


            emf.getTransaction().commit();
            emf.close();

        } else {
            System.out.println("Object not found");
            emf.close();
        }

    }

    @Override
    public boolean insert(Object x) {
        this.emf = this.em.createEntityManager();
        EntityTransaction transaction = null;
        boolean success = false;

        try {

            transaction = emf.getTransaction();
            transaction.begin();

            emf.persist(x);


            transaction.commit();
            success = true;

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            // Log the exception
            e.printStackTrace();
        } finally {
            if (emf != null && emf.isOpen()) {
                emf.close();
            }
        }

        return success;
    }
    @Override
    public boolean removeById(int id,Class<?> EntityClas) {
        this.emf = this.em.createEntityManager();
        Object d = emf.find(EntityClas, id);
        if (d != null) {//existe
            emf.getTransaction().begin();
            emf.remove(d);
            emf.getTransaction().commit();
            emf.close();
            return true;
        }else {
            em.close();
            return false;
        }

    }


    @Override
    public Object getById(int id,Class<?> entityClass) {
        this.emf = this.em.createEntityManager();
        Object x=this.emf.find(entityClass , id);
        emf.close();
        return x;
    }












}
