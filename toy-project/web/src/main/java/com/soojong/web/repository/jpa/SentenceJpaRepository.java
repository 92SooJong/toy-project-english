package com.soojong.web.repository.jpa;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.soojong.web.entity.SentenceEntity;

public interface SentenceJpaRepository extends PagingAndSortingRepository<SentenceEntity, Long> {

    @Query("select s from sentence s order by function('RAND') ")
    List<SentenceEntity> getSentenceEntityRandomOrder();


}
