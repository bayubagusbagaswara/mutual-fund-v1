package com.bayu.mutualfundv1.controller;

import com.bayu.mutualfundv1.dto.faq.FaqCategoryDTO;
import com.bayu.mutualfundv1.dto.faq.FaqCategoryDTOList;
import com.bayu.mutualfundv1.dto.faq.FaqCategoryDTOListResponse;
import com.bayu.mutualfundv1.service.FaqService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mutual-fund/faq")
public class FaqMutualFundController {

    private final FaqService faqCategoryService;


    public FaqMutualFundController(FaqService faqCategoryService) {
        this.faqCategoryService = faqCategoryService;
    }

    @GetMapping("/category/module/{module}")
    public ResponseEntity<FaqCategoryDTOListResponse> getAllFaqCategory(@RequestParam(name = "module") String module) {
        List<FaqCategoryDTO> faqCategorieList = faqCategoryService.getAllFaqCategoriesByModule(module);

        FaqCategoryDTOListResponse response = FaqCategoryDTOListResponse.builder()
                .faqCategoryDTOList(new FaqCategoryDTOList(faqCategorieList))
                .build();
        return ResponseEntity.ok(response);
    }

}
