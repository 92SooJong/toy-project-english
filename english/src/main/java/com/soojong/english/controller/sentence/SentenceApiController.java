package com.soojong.english.controller.sentence;


import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.soojong.english.dto.sentence.SentenceCreateRequestDTO;
import com.soojong.english.entity.SentenceEntity;
import com.soojong.english.service.sentence.SentenceService;
import com.soojong.english.vo.sentence.SentenceRegistrationRequestVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
public class SentenceApiController {

    private final SentenceService sentenceService;

    @PostMapping("/sentence/api/v1")
    public Long addSentence(@Valid @RequestBody SentenceCreateRequestDTO dto) {

        SentenceRegistrationRequestVO registrationRequestVO = SentenceRegistrationRequestVO.builder()
            .koreanSentence(dto.getKoreanSentence())
            .englishSentence(dto.getEnglishSentence())
            .build();

        return sentenceService.addSentence(registrationRequestVO);
    }

    @GetMapping("/sentence/api/v1/random")
    public SentenceEntity getRandomSentence() {
        // TODO - DTO로 반환해야함!!
        return sentenceService.getRandomSentence();
    }


}