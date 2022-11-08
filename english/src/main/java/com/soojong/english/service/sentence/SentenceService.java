package com.soojong.english.service.sentence;

import org.springframework.stereotype.Service;
import com.soojong.english.entity.SentenceEntity;
import com.soojong.english.repository.SentenceRepository;
import com.soojong.english.vo.sentence.SentenceRegistrationRequestVO;
import com.soojong.english.vo.sentence.SentenceVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class SentenceService {

    private final SentenceRepository sentenceRepository;

    public Long addSentence(SentenceRegistrationRequestVO sentenceRegistrationRequestVO) {

        return sentenceRepository.createSentence(sentenceRegistrationRequestVO);
    }

    public SentenceVO getRandomSentence() {

        return sentenceRepository.getRandomSentence();
    }




}
