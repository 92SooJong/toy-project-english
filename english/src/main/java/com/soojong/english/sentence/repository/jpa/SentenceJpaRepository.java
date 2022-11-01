package com.soojong.english.sentence.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.soojong.english.sentence.entity.SentenceEntity;

public interface SentenceJpaRepository extends JpaRepository<SentenceEntity, Long> {


}
