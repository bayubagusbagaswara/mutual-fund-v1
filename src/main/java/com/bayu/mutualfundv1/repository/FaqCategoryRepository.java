package com.bayu.mutualfundv1.repository;

import com.bayu.mutualfundv1.model.FaqCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqCategoryRepository extends JpaRepository<FaqCategory, Long> {
}
