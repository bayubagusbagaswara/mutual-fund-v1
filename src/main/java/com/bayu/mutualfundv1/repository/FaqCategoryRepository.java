package com.bayu.mutualfundv1.repository;

import com.bayu.mutualfundv1.model.FaqCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FaqCategoryRepository extends JpaRepository<FaqCategory, Long> {

    Optional<FaqCategory> findByCategoryCode(String categoryCode);

    List<FaqCategory> findAllByModule(String module);

}
