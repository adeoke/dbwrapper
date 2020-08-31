package org.epo.dbwrapper;

import org.epo.dbwrapper.tables.Address;
import org.epo.dbwrapper.tables.AttachmentTypeScope;

import javax.persistence.*;
import java.util.List;

public class DbWrapper {
    private EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("dbwrapper");
    private EntityManager em = emf.createEntityManager();

    public List<Address> getAllAddresses() {
        TypedQuery<Address> addr = em.createQuery("SELECT a FROM Address a", Address.class);
        return addr.getResultList();
    }

    public List<AttachmentTypeScope> getAllAttachmentTypeScopes() {
        TypedQuery<AttachmentTypeScope> ats = em.createQuery("SELECT a FROM AttachmentTypeScope a", AttachmentTypeScope.class);
        return ats.getResultList();
    }

    public void closeConnection() {
        em.close();
        emf.close();
    }
}
