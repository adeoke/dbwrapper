package org.epo.dbwrapper.tables;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DRAFTS")
public class Drafts {
    @Id
    @Column(name = "ID", unique = true)
    private String id;

    @Column(name = "CREATED_DATE", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "MODIFIED_DATE", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    @Column(name = "TITLE_OF_INVENTION")
    private String titleOfInvention;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name="USER_REFERENCE")
    private String userReference;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getTitleOfInvention() {
        return titleOfInvention;
    }

    public void setTitleOfInvention(String titleOfInvention) {
        this.titleOfInvention = titleOfInvention;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserReference() {
        return userReference;
    }

    public void setUserReference(String userReference) {
        this.userReference = userReference;
    }
}
