package com.soojong.english.sentence.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.soojong.english.sentence.dto.SentenceCreateRequestDTO;
import com.soojong.english.sentence.service.SentenceService;
import com.soojong.english.sentence.vo.SentenceRegistrationRequestVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SentenceApiController {

    private final SentenceService sentenceService;

    @PostMapping("/sentence/api/v1")
    public Long addSentence(@RequestBody SentenceCreateRequestDTO dto) {

        SentenceRegistrationRequestVO registrationRequestVO = SentenceRegistrationRequestVO.builder()
            .koreanSentence(dto.getKoreanSentence())
            .englishSentence(dto.getEnglishSentence())
            .build();

        return sentenceService.addSentence(registrationRequestVO);
    }


}
