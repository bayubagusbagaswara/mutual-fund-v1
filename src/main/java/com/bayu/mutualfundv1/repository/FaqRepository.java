package com.bayu.mutualfundv1.repository;

import com.bayu.mutualfundv1.model.Faq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FaqRepository extends JpaRepository<Faq, Long> {

    List<Faq> findAllByCategoryCode(String categoryCode);

    @Query(value = "SELECT * FROM Faq f ORDER BY f.popular_order LIMIT = :limit", nativeQuery = true)
    List<Faq> getAllFaqOrderByPopularLimit(@Param("limit") Integer limit);

    @Query(value = "SELECT * FROM Faq f ORDER BY f.popular_order ASC LIMIT = :limit", nativeQuery = true)
    List<Faq> getAllFaqOrderByPopularTop5(@Param("limit") Integer limit);

    @Query(value = "SELECT * FROM Faq f ORDER BY f.popular_order ASC LIMIT = :limit OFFSET = :offset", nativeQuery = true)
    List<Faq> getAllFaqOrderByPopularBottom5(@Param("limit") Integer limit, @Param("offset") Integer offset);

    @Query(value = "SELECT * FROM Faq f WHERE f.is_deleted = false", nativeQuery = true)
    List<Faq> getAllByIsDeletedFalse();

    List<Faq> findByIsDeletedFalse();

    Optional<Faq> findByCode(String code);

}
