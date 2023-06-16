package com.bayu.mutualfundv1.service.impl;

import com.bayu.mutualfundv1.dto.faq.CreateFaqCategoryRequest;
import com.bayu.mutualfundv1.dto.faq.FaqCategoryDTO;
import com.bayu.mutualfundv1.exception.DataNotFoundException;
import com.bayu.mutualfundv1.model.FaqCategory;
import com.bayu.mutualfundv1.repository.FaqCategoryRepository;
import com.bayu.mutualfundv1.repository.FaqRepository;
import com.bayu.mutualfundv1.service.FaqService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class FaqServiceImpl implements FaqService {

    private final FaqCategoryRepository faqCategoryRepository;
    private final FaqRepository faqRepository;

    public FaqServiceImpl(FaqCategoryRepository faqCategoryRepository, FaqRepository faqRepository) {
        this.faqCategoryRepository = faqCategoryRepository;
        this.faqRepository = faqRepository;
    }

    @Override
    public void checkCategoryCodeIsExists(String categoryCode) {
        if (faqCategoryRepository.existsByCategoryCode(categoryCode)) {
            throw new DataNotFoundException("Faq Category with code : " + categoryCode + " not found");
        }
    }

    @Override
    public FaqCategoryDTO createFaqCategory(CreateFaqCategoryRequest request) {
        FaqCategory faqCategory = FaqCategory.builder()
                .categoryCode(request.getCategoryCode())
                .name(request.getName())
                .module(request.getModule())
                .title(request.getTitle())
                .build();

        faqCategory.setCreatedDate(Instant.now());

        faqCategoryRepository.save(faqCategory);

        return mapToFaqCategoryDTO(faqCategory);
    }

    @Override
    public List<FaqCategoryDTO> getAllFaqCategoriesByModule(String module) {
        return null;
    }

    @Override
    public FaqCategoryDTO getFaqCategoryByCode(String code) {
        FaqCategory faqCategory = faqCategoryRepository.findByCategoryCode(code)
                .orElseThrow(() -> new DataNotFoundException("Faq Category with code : " + code + "not found"));
        return mapToFaqCategoryDTO(faqCategory);
    }

    private static FaqCategoryDTO mapToFaqCategoryDTO(FaqCategory faqCategory) {
        return FaqCategoryDTO.builder()
                .id(String.valueOf(faqCategory.getId()))
                .categoryCode(faqCategory.getCategoryCode())
                .name(faqCategory.getName())
                .module(faqCategory.getModule())
                .createdDate(faqCategory.getCreatedDate())
                .build();
    }

}
