package com.bayu.mutualfundv1.dto.faq;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FaqCategoryDTOListResponse {

    private FaqCategoryDTOList faqCategoryDTOList;
}
