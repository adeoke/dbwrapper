package org.epo.dbwrapper.parties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PARTIES")
public class Parties {
    @Id
    @Column(name = "ID", unique = true)
    private String id;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "TELEPHONE")
    private String telephone;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "CORRESPONDENCE_ADDRESS_ID")
    private String correspondenceAddressId;

    @Column(name = "RESIDENCE_ADDRESS_ID")
    private String residenceAddressId;

    @Column(name = "ROLE_ID")
    private String roleId;

    @Column(name = "DRAFT_ID")
    private String draftId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCorrespondenceAddressId() {
        return correspondenceAddressId;
    }

    public void setCorrespondenceAddressId(String correspondenceAddressId) {
        this.correspondenceAddressId = correspondenceAddressId;
    }

    public String getResidenceAddressId() {
        return residenceAddressId;
    }

    public void setResidenceAddressId(String residenceAddressId) {
        this.residenceAddressId = residenceAddressId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getDraftId() {
        return draftId;
    }

    public void setDraftId(String draftId) {
        this.draftId = draftId;
    }
}
