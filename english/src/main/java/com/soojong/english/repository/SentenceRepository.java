package com.soojong.english.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.soojong.english.entity.SentenceEntity;
import com.soojong.english.repository.jpa.SentenceJpaRepository;
import com.soojong.english.vo.sentence.SentenceRegistrationRequestVO;
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

    public SentenceEntity getRandomSentence() {

        List<SentenceEntity> sentenceEntity = sentenceJpaRepository.getSentenceEntityRandomOrder();

        // TODO - VO 변환 코드 추가

        return sentenceEntity.get(0);
    }



}
