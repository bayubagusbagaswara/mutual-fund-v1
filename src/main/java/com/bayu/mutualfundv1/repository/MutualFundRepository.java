package com.bayu.mutualfundv1.repository;

import com.bayu.mutualfundv1.model.MutualFund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MutualFundRepository extends JpaRepository<MutualFund, Long> {
}
