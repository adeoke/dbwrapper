package org.epo.dbwrapper.test;

import org.epo.dbwrapper.config.SpringTestConfiguration;
import org.epo.dbwrapper.app.DbWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ContextConfiguration(classes = {SpringTestConfiguration.class})
public class CountriesRepositoryTest {

    @Autowired
    private DbWrapper dbWrapper;

    @Test
    public void allGood() {

        System.out.println(dbWrapper.getCountriesRepository().count());
        System.out.println();
    }
}
