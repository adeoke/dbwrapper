package org.epo.dbwrapper.respositories;

import org.epo.dbwrapper.models.Countries;
import org.springframework.data.repository.CrudRepository;

public interface CountriesRepository extends CrudRepository<Countries, String> {
}
