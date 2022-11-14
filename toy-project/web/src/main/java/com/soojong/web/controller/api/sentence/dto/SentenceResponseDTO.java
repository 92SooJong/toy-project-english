package com.soojong.web.controller.api.sentence.dto;

import lombok.Builder;

@Builder
public class SentenceResponseDTO {

    private Long id;
    private String koreanSentence;
    private String englishSentence;

}
