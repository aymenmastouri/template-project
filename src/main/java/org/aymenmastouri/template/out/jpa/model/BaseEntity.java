package org.aymenmastouri.template.out.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import java.time.Instant;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * Abstract base class for all master-data entity types.
 *
 * <p>Subclasses inherit both optimistic locking and automatic creation and modification timestamps.
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
abstract class BaseEntity {

    @Version
    @Column(name = "modification_counter", nullable = false)
    private Long modificationCounter;

    @SuppressWarnings({"FieldMayBeFinal", "CanBeFinal"})
    @CreatedDate
    @Column(name = "created_date", nullable = false, updatable = false)
    private Instant createdDate = null;

    @SuppressWarnings({"FieldMayBeFinal", "CanBeFinal"})
    @LastModifiedDate
    @Column(name = "last_modified_date", nullable = false)
    private Instant lastModifiedDate = null;

    public Long getModificationCounter() {
        return modificationCounter;
    }

    protected void setModificationCounter(Long modificationCounter) {
        this.modificationCounter = modificationCounter;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }
}
