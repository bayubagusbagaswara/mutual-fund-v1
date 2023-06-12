package com.bayu.mutualfundv1.repository;

import com.bayu.mutualfundv1.model.BranchLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BranchLocationRepository extends JpaRepository<BranchLocation, Long> {

    Optional<BranchLocation> findByCode(String code);

}
