package com.bayu.mutualfundv1.repository;

import com.bayu.mutualfundv1.model.NavPerformance;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NavPerformanceRepository extends JpaRepository<NavPerformance, Long> {

    List<NavPerformance> findByMutualFundCode(String mutualFundCode);

    // sort by date
    List<NavPerformance> findByMutualFundCode(String mutualFundCode, Sort sort);
}
