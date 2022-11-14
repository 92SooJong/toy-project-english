package com.soojong.web.service.sentence;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import com.soojong.web.repository.SentenceRepository;
import com.soojong.web.vo.sentence.SentenceRegistrationRequestVO;
import com.soojong.web.vo.sentence.SentenceVO;
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
