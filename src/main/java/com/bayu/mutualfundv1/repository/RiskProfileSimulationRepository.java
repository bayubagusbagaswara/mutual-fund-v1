package com.bayu.mutualfundv1.repository;

import com.bayu.mutualfundv1.model.RiskProfileSimulation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskProfileSimulationRepository extends JpaRepository<RiskProfileSimulation, Long> {
}
