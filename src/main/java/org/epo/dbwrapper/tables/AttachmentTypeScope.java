package org.epo.dbwrapper.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATTACHMENT_TYPE_SCOPE")
public class AttachmentTypeScope {
    @Id
    @Column(name = "ID", unique = true)
    private String id;

    @Column(name="END")
    private int end;

    @Column(name = "NUMBER_OF_CLAIMS")
    public int numberOfClaims;

    @Column(name="START")
    private int start;

    @Column(name = "TYPE")
    private int type;

    @Column(name="COMBINED_FILE_ID")
    private String combinedFieldId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getNumberOfClaims() {
        return numberOfClaims;
    }

    public void setNumberOfClaims(int numberOfClaims) {
        this.numberOfClaims = numberOfClaims;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCombinedFieldId() {
        return combinedFieldId;
    }

    public void setCombinedFieldId(String combinedFieldId) {
        this.combinedFieldId = combinedFieldId;
    }
}
