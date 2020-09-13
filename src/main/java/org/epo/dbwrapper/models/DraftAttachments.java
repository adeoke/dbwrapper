package org.epo.dbwrapper.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DRAFT_ATTACHMENTS")
public class DraftAttachments {
    @Id
    @Column(name = "ID", unique = true)
    private String id;

    @Column(name="ATTACHMENT_TYPE")
    private int attachmentType;

    @Column(name="BYTES")
    private Long bytes;

    @Column(name="FILE_NAME")
    private String fileName;

    @Column(name = "MIME_TYPE")
    private String mimeType;

    @Column(name = "NUMBER_OF_CLAIMS")
    private Long numberOfClaims;

    @Column(name="COMBINED_FILE_ID")
    private String combinedFileId;

    @Column(name = "DRAFT_ID")
    private String draftId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(int attachmentType) {
        this.attachmentType = attachmentType;
    }

    public Long getBytes() {
        return bytes;
    }

    public void setBytes(Long bytes) {
        this.bytes = bytes;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Long getNumberOfClaims() {
        return numberOfClaims;
    }

    public void setNumberOfClaims(Long numberOfClaims) {
        this.numberOfClaims = numberOfClaims;
    }

    public String getCombinedFileId() {
        return combinedFileId;
    }

    public void setCombinedFileId(String combinedFileId) {
        this.combinedFileId = combinedFileId;
    }

    public String getDraftId() {
        return draftId;
    }

    public void setDraftId(String draftId) {
        this.draftId = draftId;
    }
}
