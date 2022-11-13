package com.soojong.web.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.soojong.web.entity.SentenceEntity;
import com.soojong.web.repository.jpa.SentenceJpaRepository;
import com.soojong.web.vo.sentence.SentenceRegistrationRequestVO;
import com.soojong.web.vo.sentence.SentenceVO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class SentenceRepository {

    private final SentenceJpaRepository sentenceJpaRepository;

    public Long createSentence(SentenceRegistrationRequestVO sentenceRegistrationRequestVO) {

        SentenceEntity entity = SentenceEntity.builder()
            .koreanSentence(sentenceRegistrationRequestVO.getKoreanSentence())
            .englishSentence(sentenceRegistrationRequestVO.getEnglishSentence())
            .userId(sentenceRegistrationRequestVO.getUserId())
            .build();

        return sentenceJpaRepository.save(entity).getId();
    }

    public SentenceVO getRandomSentence() {

        List<SentenceEntity> sentenceEntityList = sentenceJpaRepository.getSentenceEntityRandomOrder();

        // TODO - 데이터가 없는 경우 처리
        SentenceEntity sentenceEntity = sentenceEntityList.get(0);

        return SentenceVO.builder()
            .id(sentenceEntity.getId())
            .englishSentence(sentenceEntity.getEnglishSentence())
            .koreanSentence(sentenceEntity.getKoreanSentence())
            .build();




    }



}
