package br.com.taskmanager.dao;

import br.com.taskmanager.model.Base;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

public class Dao<T extends Base> implements Serializable {

    private static final EntityManager manager = ConnectionFactory.getEntityManager();

    public T searchById(Class<T> clazz, Integer id) {
        return manager.find(clazz, id);
    }

    public void salve(T t) {
        try {
            manager.getTransaction().begin();

            if (t.getId() == null) {
                manager.persist(t);
            }
            else{
                manager.merge(t);
            }

            manager.getTransaction().commit();
        }
        catch (Exception e) {
            manager.getTransaction().rollback();
        }
    }

    public void remove(Class<T> clazz, Integer id) {
        T t = searchById(clazz, id);

        try {
            manager.getTransaction().begin();
            manager.remove(t);
            manager.getTransaction().commit();
        }
        catch (Exception e) {
            manager.getTransaction().rollback();
        }
    }

    @SuppressWarnings("unchecked")
    public List<T> fetchAll(String jpql) {
        Query query = manager.createQuery(jpql);
        return query.getResultList();
    }
}
