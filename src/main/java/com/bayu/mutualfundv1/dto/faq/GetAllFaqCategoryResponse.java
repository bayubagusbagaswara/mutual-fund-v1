package com.bayu.mutualfundv1.dto.faq;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetAllFaqCategoryResponse {

    private FaqCategoryDTO reksadana;

    private FaqCategoryDTO registrasi;

    private FaqCategoryDTO beliReksadana;

    private FaqCategoryDTO jualReksadana;

    private FaqCategoryDTO portfolio;

    private FaqCategoryDTO lainnya;

}
