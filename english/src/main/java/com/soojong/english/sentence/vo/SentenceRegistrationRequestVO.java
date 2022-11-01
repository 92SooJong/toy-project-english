package com.soojong.english.sentence.vo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SentenceRegistrationRequestVO {

    private String englishSentence;
    private String koreanSentence;

}
