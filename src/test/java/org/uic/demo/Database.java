package org.uic.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.Test;
import org.uic.demo.dao.Staff;

import javax.persistence.EntityManager;
import java.util.List;

public class Database {

    @Test
    public void setUp() {
        SessionFactory sessionFactory = null;
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            EntityManager entityManager = sessionFactory.createEntityManager();
            entityManager.getTransaction().begin();
            List<Staff> result = entityManager.createQuery( "from Staff", Staff.class ).getResultList();
            System.out.println("xxxxxxxx: " + result.size());
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            System.err.println(e.getMessage());
            StandardServiceRegistryBuilder.destroy(registry);
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }
}
