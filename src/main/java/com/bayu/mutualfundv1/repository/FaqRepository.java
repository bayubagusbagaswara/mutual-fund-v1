package com.bayu.mutualfundv1.repository;

import com.bayu.mutualfundv1.model.Faq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaqRepository extends JpaRepository<Faq, Long> {

    List<Faq> findAllByCategoryCode(String categoryCode);

}
