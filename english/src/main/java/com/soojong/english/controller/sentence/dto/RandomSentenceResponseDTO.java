package com.soojong.english.controller.sentence.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
public class RandomSentenceResponseDTO {

    private Long id;
    private String koreanSentence;
    private String englishSentence;

}
