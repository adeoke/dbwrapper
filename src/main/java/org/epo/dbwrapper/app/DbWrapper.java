package org.epo.dbwrapper.app;

import org.epo.dbwrapper.country.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbWrapper {

    public CountriesRepository getCountriesRepository() {
        return countriesRepository;
    }

    @Autowired
    private CountriesRepository countriesRepository;
}

