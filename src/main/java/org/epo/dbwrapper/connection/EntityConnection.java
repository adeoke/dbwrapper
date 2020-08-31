package org.epo.dbwrapper.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityConnection implements Conn {
    private EntityManagerFactory emf;
    private EntityManager em;

    public EntityConnection() {
        emf = Persistence.createEntityManagerFactory("dbwrapper");
        em = emf.createEntityManager();
    }

    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    public void close() {
        em.close();
        emf.close();
    }
}
