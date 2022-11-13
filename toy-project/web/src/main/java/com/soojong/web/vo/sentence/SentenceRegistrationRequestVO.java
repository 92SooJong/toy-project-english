package com.soojong.web.vo.sentence;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SentenceRegistrationRequestVO {

    private String englishSentence;
    private String koreanSentence;
    private String userId;

}
