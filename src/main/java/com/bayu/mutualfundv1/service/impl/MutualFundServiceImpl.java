package com.bayu.mutualfundv1.service.impl;

import com.bayu.mutualfundv1.dto.mutualfund.CreateMutualFundRequest;
import com.bayu.mutualfundv1.dto.mutualfund.CreateMutualFundResponse;
import com.bayu.mutualfundv1.repository.MutualFundRepository;
import com.bayu.mutualfundv1.service.MutualFundService;
import org.springframework.stereotype.Service;

@Service
public class MutualFundServiceImpl implements MutualFundService {

    private final MutualFundRepository mutualFundRepository;

    public MutualFundServiceImpl(MutualFundRepository mutualFundRepository) {
        this.mutualFundRepository = mutualFundRepository;
    }

    @Override
    public CreateMutualFundResponse createMutualFund(CreateMutualFundRequest request) {
        return null;
    }
}
