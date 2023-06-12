package com.bayu.mutualfundv1.repository;

import com.bayu.mutualfundv1.model.RiskProfileQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskProfileQuestionRepository extends JpaRepository<RiskProfileQuestion, Long> {
}
