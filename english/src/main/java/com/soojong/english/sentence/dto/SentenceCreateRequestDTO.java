package com.soojong.english.sentence.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class SentenceCreateRequestDTO {

    private String englishSentence;
    private String koreanSentence;

    public SentenceCreateRequestDTO(String englishSentence, String koreanSentence) {
        this.englishSentence = englishSentence;
        this.koreanSentence = koreanSentence;
    }

}
