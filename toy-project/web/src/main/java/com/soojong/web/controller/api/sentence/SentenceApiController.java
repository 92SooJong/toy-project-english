package com.soojong.web.controller.api.sentence;


import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.soojong.web.controller.api.sentence.dto.SentenceResponseDTO;
import com.soojong.web.controller.api.sentence.dto.SentenceCreateRequestDTO;
import com.soojong.web.entity.SentenceEntity;
import com.soojong.web.repository.SentenceRepository;
import com.soojong.web.service.sentence.SentenceService;
import com.soojong.web.vo.sentence.SentenceRegistrationRequestVO;
import com.soojong.web.vo.sentence.SentenceVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
public class SentenceApiController {

    private final SentenceService sentenceService;
    private final SentenceRepository sentenceRepository;

    @PostMapping("/sentence/api/v1")
    public Long addSentence(@Valid @RequestBody SentenceCreateRequestDTO dto) {

        SentenceRegistrationRequestVO sentenceRegistrationRequestVO = dto.toSentenceRegistrationRequestVO();

        return sentenceService.addSentence(sentenceRegistrationRequestVO);
    }

    @GetMapping("/sentence/api/v1/random")
    public SentenceResponseDTO getRandomSentence() {

        SentenceVO randomSentence = sentenceService.getRandomSentence();

        return SentenceResponseDTO.builder()
            .id(randomSentence.getId())
            .koreanSentence(randomSentence.getKoreanSentence())
            .englishSentence(randomSentence.getEnglishSentence())
            .build();
    }

    @GetMapping("/save")
    public void test() {

        for (int i=0; i< 100; i++) {
            SentenceRegistrationRequestVO requestVO = SentenceRegistrationRequestVO.builder()
                .userId("soojong")
                .koreanSentence("kor" + i)
                .englishSentence("en" + i)
                .build();
            sentenceRepository.createSentence(requestVO);
        }

    }

    @GetMapping("/sentence/api/page")
    public String getSentenceListForPage(Pageable pageable) {
        List<SentenceVO> sentenceList = sentenceRepository.getSentenceList(pageable);

        List<SentenceResponseDTO> collect = sentenceList.stream()
            .map(vo -> SentenceResponseDTO.builder()
                .id(vo.getId())
                .koreanSentence(vo.getKoreanSentence())
                .englishSentence(vo.getEnglishSentence())
                .build()
            ).toList();

        return collect.toString();

    }



}
