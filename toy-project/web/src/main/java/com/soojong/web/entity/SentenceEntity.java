package com.soojong.web.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "sentence")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SentenceEntity extends BaseTimeAuditingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String koreanSentence;

    private String englishSentence;





}
