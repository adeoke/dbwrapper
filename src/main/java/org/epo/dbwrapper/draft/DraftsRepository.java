package org.epo.dbwrapper.draft;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DraftsRepository extends CrudRepository<Drafts, String> {
}
