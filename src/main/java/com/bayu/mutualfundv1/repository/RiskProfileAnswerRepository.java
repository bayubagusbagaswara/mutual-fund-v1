package com.bayu.mutualfundv1.repository;

import com.bayu.mutualfundv1.model.RiskProfileAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskProfileAnswerRepository extends JpaRepository<RiskProfileAnswer, Long> {
}
