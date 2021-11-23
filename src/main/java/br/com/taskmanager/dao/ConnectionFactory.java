package br.com.taskmanager.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    public static EntityManager getEntityManager () {
        return factory.createEntityManager();
    }
}
