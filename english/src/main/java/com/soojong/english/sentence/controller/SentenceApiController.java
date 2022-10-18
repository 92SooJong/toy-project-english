package com.soojong.english.sentence.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.soojong.english.sentence.dto.SentenceCreateRequestDTO;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SentenceApiController {


    @PostMapping("/sentence/api/v1")
    public void createSentence(@RequestBody SentenceCreateRequestDTO sentenceCreateRequestDTO){
        System.out.println(sentenceCreateRequestDTO.getEnglishSentence());
        System.out.println(sentenceCreateRequestDTO.getKoreanSentence());

    }


}
