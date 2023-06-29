package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainApplication {
    public static void main(String ... args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("samplePU");
        EntityManager em = emf.createEntityManager();

        UserInfo user = new UserInfo();
        user.setName("John Doe");
        user.setEmail("john@example.com");

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();

        UserInfo savedUser = em.find(UserInfo.class, user.getId());
        System.out.println("Saved User: " + savedUser.getName());

        em.close();
        emf.close();
    }
}