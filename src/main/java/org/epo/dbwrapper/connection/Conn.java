package org.epo.dbwrapper.connection;

import javax.persistence.EntityManager;

public interface Conn {
    EntityManager getEntityManager();
    void close();
}
