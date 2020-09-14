package org.epo.dbwrapper.combinedfiles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMBINED_FILES")
public class CombinedFiles {
    @Id
    @Column(name = "ID", unique = true)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
