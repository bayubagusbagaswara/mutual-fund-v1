package com.bayu.mutualfundv1.service;

import com.bayu.mutualfundv1.dto.faq.*;

import java.util.List;

public interface FaqService {

    void checkCategoryCodeIsExists(String categoryCode);

    FaqCategoryDTO createFaqCategory(CreateFaqCategoryRequest request);

    List<FaqCategoryDTO> getAllFaqCategoriesByModule(String module);

    FaqCategoryDTO getFaqCategoryByCode(String code);

    GetFaqTotalResponse getFaqTotal();

    GetFaqTotalResponse getFaqTotalNew();

    FaqDTO createFaq(CreateFaqRequest createFaqRequest);

    FaqDTO updateSeenByUser(String faqCode, Integer seenByUser);

    List<FaqDTO> getAllFaq();

    List<FaqDTO> getAllFaqPopular();

    List<FaqDTO> getFaqPopularTop5();

    List<FaqDTO> getFaqPopularBottom5();

    List<FaqDTO> getFaqByFaqCategoryCode(String faqCategoryCode);

    FaqDTO getFaqByCode(String code);
}
