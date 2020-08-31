package org.epo.dbwrapper.dao;

import org.epo.dbwrapper.connection.Conn;
import org.epo.dbwrapper.connection.EntityConnection;
import org.epo.dbwrapper.tables.Address;

import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class AddressDao implements Dao<Address> {
    private EntityConnection entityConnection;

    public AddressDao() {
        entityConnection = new EntityConnection();
    }

    @Override
    public Optional<Address> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Address> getAll() {
        TypedQuery<Address> addr = entityConnection.getEntityManager().createQuery("SELECT a FROM Address a", Address.class);
        return addr.getResultList();
    }

    @Override
    public void save(Address address) {

    }

    @Override
    public void update(Address address, String[] params) {

    }

    @Override
    public void delete(Address address) {

    }
}
