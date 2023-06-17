package com.bayu.mutualfundv1.service.impl;

import com.bayu.mutualfundv1.dto.faq.*;
import com.bayu.mutualfundv1.exception.DataNotFoundException;
import com.bayu.mutualfundv1.model.Faq;
import com.bayu.mutualfundv1.model.FaqCategory;
import com.bayu.mutualfundv1.repository.FaqCategoryRepository;
import com.bayu.mutualfundv1.repository.FaqRepository;
import com.bayu.mutualfundv1.service.FaqService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<GetAllFaqCategoryByModule> getFaqCategoriesByModule(String module) {
        List<FaqCategory> faqCategoryList = faqCategoryRepository.findAllByModule(module);
        List<FaqDTO> faqList = getAllFaq();

        List<GetAllFaqCategoryByModule> faqCategories = mapToFaqCategoriesByModule(faqCategoryList);

        for (int i = 0; i < faqCategoryList.size(); i++) {
            for (FaqDTO faqDTO : faqList) {
                if (faqCategoryList.get(i).getCategoryCode().equalsIgnoreCase(faqDTO.getFaqCategoryCode())) {
                    List<FaqDTO> faqDTOList = getFaqByFaqCategoryCode(faqCategoryList.get(i).getCategoryCode());
                    faqCategories.get(i).setFaqDTOList(faqDTOList);
                }
            }
        }
        return faqCategories;
    }

    @Override
    public GetFaqTotalResponse getFaqTotal() {
        String module = "REKSADANA";
        return GetFaqTotalResponse.builder()
                .faqPopularTop5(getFaqPopularTop5())
                .faqPopularBottom5(getFaqPopularBottom5())
                .faqCategory(getFaqCategoriesByModule(module))
                .build();
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

    private static List<FaqCategoryDTO> mapToFaqCategoryDTOList(List<FaqCategory> faqCategoryList) {
        return faqCategoryList.stream()
                .map(FaqServiceImpl::mapToFaqCategoryDTO)
                .collect(Collectors.toList());
    }

    private static FaqDTO mapToFaqDTO(Faq faq) {
        return FaqDTO.builder()
                .id(String.valueOf(faq.getId()))
                .faqCode(faq.getCode())
                .question(faq.getQuestion())
                .answer(faq.getAnswer())
                .seenByUser(faq.getSeenByUser())
                .faqCategoryCode(faq.getCategoryCode())
                .createdDate(faq.getCreatedDate())
                .build();
    }

    private static List<FaqDTO> mapToFaqDTOList(List<Faq> faqList) {
        return faqList.stream()
                .map(FaqServiceImpl::mapToFaqDTO)
                .collect(Collectors.toList());
    }

    private static GetAllFaqCategoryByModule mapToGetFaqCategoriesByModuleResponse(FaqCategory faqCategory, List<Faq> faqList) {
        return GetAllFaqCategoryByModule.builder()
                .id(String.valueOf(faqCategory.getId()))
                .categoryCode(faqCategory.getCategoryCode())
                .name(faqCategory.getName())
                .module(faqCategory.getModule())
                .createdDate(faqCategory.getCreatedDate())
                // find all faq by category code
                // map dari List<Faq> ke List<FaqDTO>
                .faqDTOList(mapToFaqDTOList(faqList))
                .build();

    }

    private static GetAllFaqCategoryByModule mapToGetFaqCategories(FaqCategory faqCategory) {
        return GetAllFaqCategoryByModule.builder()
                .id(String.valueOf(faqCategory.getId()))
                .categoryCode(faqCategory.getCategoryCode())
                .name(faqCategory.getName())
                .module(faqCategory.getModule())
                .createdDate(faqCategory.getCreatedDate())
                .build();

    }

    private static List<GetAllFaqCategoryByModule> mapToFaqCategoriesByModule(List<FaqCategory> faqCategoryList) {
        return faqCategoryList.stream()
                .map(FaqServiceImpl::mapToGetFaqCategories)
                .collect(Collectors.toList());
    }

}
