package com.soojong.english.sentence.service;

import org.springframework.stereotype.Service;
import com.soojong.english.sentence.repository.SentenceRepository;
import com.soojong.english.sentence.vo.SentenceRegistrationRequestVO;
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




}
