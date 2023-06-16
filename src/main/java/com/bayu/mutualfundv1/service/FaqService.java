package com.bayu.mutualfundv1.service;

import com.bayu.mutualfundv1.dto.faq.CreateFaqCategoryRequest;
import com.bayu.mutualfundv1.dto.faq.FaqCategoryDTO;
import com.bayu.mutualfundv1.dto.faq.GetFaqTotalResponse;

import java.util.List;

public interface FaqService {

    void checkCategoryCodeIsExists(String categoryCode);

    FaqCategoryDTO createFaqCategory(CreateFaqCategoryRequest request);

    List<FaqCategoryDTO> getAllFaqCategoriesByModule(String module);

    FaqCategoryDTO getFaqCategoryByCode(String code);

    GetFaqTotalResponse getFaqTotal();

    GetFaqTotalResponse getFaqTotalNew();

}
