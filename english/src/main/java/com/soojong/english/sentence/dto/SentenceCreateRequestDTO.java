package com.soojong.english.sentence.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
public class SentenceCreateRequestDTO {

    private String englishSentence;
    private String koreanSentence;

}
