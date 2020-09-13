package org.epo.dbwrapper.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OFFICES")
public class Offices {
    @Id
    @Column(name = "ID", unique = true)
    private String id;

    @Column(name = "APPLICATION_KIND")
    private String applicationKind;

    @Column(name = "NAME")
    private String name;

    @Column(name = "OFFICE_TYPE")
    private String officeType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplicationKind() {
        return applicationKind;
    }

    public void setApplicationKind(String applicationKind) {
        this.applicationKind = applicationKind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeType() {
        return officeType;
    }

    public void setOfficeType(String officeType) {
        this.officeType = officeType;
    }
}
