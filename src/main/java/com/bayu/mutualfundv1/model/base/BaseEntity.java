package com.bayu.mutualfundv1.model.base;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.Instant;

@MappedSuperclass
@Data
public abstract class BaseEntity {

//    @Column(name = "created_by", nullable = false)
//    private String createdBy;

    @Column(name = "created_date", nullable = false)
    private Instant createdDate;

//    @Column(name = "modified_by")
//    private String modifiedBy;

//    @Column(name = "modified_date")
//    private Instant modifiedDate;

    @Column(name = "is_deleted")
    private Boolean isDeleted = Boolean.FALSE;
}