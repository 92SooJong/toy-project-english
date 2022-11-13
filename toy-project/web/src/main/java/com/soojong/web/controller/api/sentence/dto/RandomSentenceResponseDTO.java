package com.soojong.web.controller.api.sentence.dto;

import lombok.Builder;

@Builder
public class RandomSentenceResponseDTO {

    private Long id;
    private String koreanSentence;
    private String englishSentence;

}
