package com.bayu.mutualfundv1.dto.faq;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetFaqTotalResponse {

    // object pertama
    private List<FaqDTO> faqPopularTop5;

    // object kedua
    private List<FaqDTO> faqPopularBottom5;

    // object ketiga
    private List<GetAllFaqCategoryByModule> faqCategory;

}
