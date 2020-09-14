package org.epo.dbwrapper.address;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "ADDRESS")
public class Address {
    @Id
    @Column(name = "ID", unique = true)
    private String id;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "PO_BOX")
    private String poBox;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "STREET_ADDRESS")
    private String streetAddress;

    @Column(name = "COUNTRY_ID")
    private String countryId;

    @Column(name = "REGION_ID")
    private String regionId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }
}