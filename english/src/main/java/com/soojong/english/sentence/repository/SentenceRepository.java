package com.soojong.english.sentence.repository;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.soojong.english.sentence.entity.SentenceEntity;
import com.soojong.english.sentence.repository.jpa.SentenceJpaRepository;
import com.soojong.english.sentence.vo.SentenceRegistrationRequestVO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class SentenceRepository {

    private final SentenceJpaRepository sentenceJpaRepository;

    public Long createSentence(SentenceRegistrationRequestVO sentenceRegistrationRequestVO) {

        SentenceEntity entity = SentenceEntity.builder()
            .koreanSentence(sentenceRegistrationRequestVO.getKoreanSentence())
            .englishSentence(sentenceRegistrationRequestVO.getEnglishSentence())
            .build();

        return sentenceJpaRepository.save(entity).getId();
    }



}
