package org.uic.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.uic.demo.dao.Staff;

import javax.persistence.EntityManager;
import java.util.List;

public class Database {

    public static void main(String[] args) {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            EntityManager entityManager = sessionFactory.createEntityManager();
            entityManager.getTransaction().begin();
            List<Staff> result = entityManager.createQuery( "from staff", Staff.class ).getResultList();
            System.out.println("xxxxxxxx: " + result.size());
            entityManager.getTransaction().commit();
            entityManager.close();
            sessionFactory.close();
        } catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
