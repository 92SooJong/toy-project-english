package com.soojong.web.repository.jpa;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.soojong.web.entity.SentenceEntity;

public interface SentenceJpaRepository extends JpaRepository<SentenceEntity, Long> {

    @Query("select s from sentence s order by function('RAND') ")
    List<SentenceEntity> getSentenceEntityRandomOrder();

}
