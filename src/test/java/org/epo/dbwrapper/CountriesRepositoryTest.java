package org.epo.dbwrapper;

import org.epo.dbwrapper.country.CountriesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CountriesRepositoryTest {

    @Autowired
    private CountriesRepository countriesRepository;

    @Test
    public void allGood() {
//        System.out.println("item by id is:  " + officesRepository.findById("20f3901d-defc-43ce-b181-5c9692a6e8c3") + "\n\n");
        System.out.println(countriesRepository.count());
    }
}
