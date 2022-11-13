package com.soojong.web.controller.api.sentence;


import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.soojong.web.controller.api.sentence.dto.RandomSentenceResponseDTO;
import com.soojong.web.controller.api.sentence.dto.SentenceCreateRequestDTO;
import com.soojong.web.service.sentence.SentenceService;
import com.soojong.web.vo.sentence.SentenceRegistrationRequestVO;
import com.soojong.web.vo.sentence.SentenceVO;
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

        SentenceRegistrationRequestVO sentenceRegistrationRequestVO = dto.toSentenceRegistrationRequestVO();

        return sentenceService.addSentence(sentenceRegistrationRequestVO);
    }

    @GetMapping("/sentence/api/v1/random")
    public RandomSentenceResponseDTO getRandomSentence() {

        SentenceVO randomSentence = sentenceService.getRandomSentence();

        return RandomSentenceResponseDTO.builder()
            .id(randomSentence.getId())
            .koreanSentence(randomSentence.getKoreanSentence())
            .englishSentence(randomSentence.getEnglishSentence())
            .build();
    }


}
