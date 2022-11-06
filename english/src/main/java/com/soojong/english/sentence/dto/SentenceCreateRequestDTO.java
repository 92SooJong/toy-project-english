package com.soojong.english.sentence.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
