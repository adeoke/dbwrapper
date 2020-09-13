package org.epo.dbwrapper.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORGANIZATIONS")
public class Organizations {
    @Id
    @Column(name = "ID", unique = true)
    private String id;

    @Column(name="DEPARTMENT")
    private String department;

    @Column(name = "NAME")
    private String name;

    @Column(name = "BUSINESS_COUNTRY_ID")
    private String businessCountryId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessCountryId() {
        return businessCountryId;
    }

    public void setBusinessCountryId(String businessCountryId) {
        this.businessCountryId = businessCountryId;
    }
}
