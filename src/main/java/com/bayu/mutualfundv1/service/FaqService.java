package com.bayu.mutualfundv1.service;

import com.bayu.mutualfundv1.dto.faq.CreateFaqCategoryRequest;
import com.bayu.mutualfundv1.dto.faq.FaqCategoryDTO;

public interface FaqService {

    FaqCategoryDTO createFaqCategory(CreateFaqCategoryRequest request);
}
