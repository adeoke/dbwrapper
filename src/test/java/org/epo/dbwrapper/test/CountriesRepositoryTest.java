package org.epo.dbwrapper.test;

import org.epo.dbwrapper.config.SpringTestConfiguration;
import org.epo.dbwrapper.country.CountriesRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SpringTestConfiguration.class})
@SpringBootConfiguration
@AutoConfigurationPackage
public class CountriesRepositoryTest {

    @Autowired
    private CountriesRepository countriesRepository;

    @Test
    public void allGood() {

        countriesRepository.count();
        System.out.println();
    }
}
