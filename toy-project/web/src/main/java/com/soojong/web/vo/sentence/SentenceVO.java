package com.soojong.web.vo.sentence;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SentenceVO {

    private Long id;
    private String koreanSentence;
    private String englishSentence;


}
