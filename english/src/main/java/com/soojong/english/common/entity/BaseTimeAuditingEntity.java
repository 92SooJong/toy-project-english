package com.soojong.english.common.entity;

import java.time.LocalDateTime;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Getter;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeAuditingEntity {

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime updateDate;

}
