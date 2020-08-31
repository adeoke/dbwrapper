package org.epo.dbwrapper;

import org.epo.dbwrapper.dao.AddressDao;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSpDb {
    private DbWrapper dbWrapper;
    private AddressDao addressDao;

    @BeforeEach
    public void setUp() {
        addressDao = new AddressDao();
    }

    @Test
    public void getAllTest() {
        addressDao.getAll().forEach(item -> System.out.println(item.getRegionId()));
    }
}
