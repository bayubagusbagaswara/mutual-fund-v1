package com.bayu.mutualfundv1.controller;

import com.bayu.mutualfundv1.service.FaqService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mutual-fund/faq")
public class FaqMutualFundController {

    private final FaqService faqCategoryService;


    public FaqMutualFundController(FaqService faqCategoryService) {
        this.faqCategoryService = faqCategoryService;
    }
}
