package com.bayu.mutualfundv1.repository;

import com.bayu.mutualfundv1.model.NavPerformance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NavPerformanceRepository extends JpaRepository<NavPerformance, Long> {
}
