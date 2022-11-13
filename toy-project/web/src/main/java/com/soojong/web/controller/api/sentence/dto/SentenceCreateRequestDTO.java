package com.soojong.web.controller.api.sentence.dto;

import javax.validation.constraints.NotBlank;

import com.soojong.web.vo.sentence.SentenceRegistrationRequestVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SentenceCreateRequestDTO {

    @NotBlank(message = "Please Insert English Sentence")
    private String englishSentence;

    @NotBlank(message = "Please Insert Korean Sentence")
    private String koreanSentence;

    @NotBlank(message = "Please Insert User Id")
    private String userId;

    public SentenceRegistrationRequestVO toSentenceRegistrationRequestVO() {

        return SentenceRegistrationRequestVO.builder()
            .englishSentence(this.englishSentence)
            .koreanSentence(this.koreanSentence)
            .userId(this.userId)
            .build();

    }



}
