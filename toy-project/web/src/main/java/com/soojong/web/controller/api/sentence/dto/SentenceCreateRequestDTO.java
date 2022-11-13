package com.soojong.web.controller.api.sentence.dto;

import javax.validation.constraints.NotBlank;

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

}
