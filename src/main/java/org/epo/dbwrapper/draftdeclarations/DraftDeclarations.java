package org.epo.dbwrapper.draftdeclarations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "DRAFT_DECLARATIONS")
public class DraftDeclarations {
    @Id
    @Column(name = "ID", unique = true)
    private String id;

    @Column(name = "APPLICATION_KIND")
    private String applicationKind;

    @Column(name = "APPLICATION_NUMBER")
    private String applicationNumber;

    @Column(name = "FILING_DATE")
    private Date filingDate;

    @Column(name = "OFFICE")
    private String office;

    @Column(name = "OFFICE_TYPE")
    private String officeType;

    @Column(name = "DRAFT_ID")
    private String draftId;

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

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public Date getFilingDate() {
        return filingDate;
    }

    public void setFilingDate(Date filingDate) {
        this.filingDate = filingDate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getOfficeType() {
        return officeType;
    }

    public void setOfficeType(String officeType) {
        this.officeType = officeType;
    }

    public String getDraftId() {
        return draftId;
    }

    public void setDraftId(String draftId) {
        this.draftId = draftId;
    }
}
