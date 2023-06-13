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
public class GetFaqCategoryResponse {

    private List<GetAllFaqCategoryByModule> faqCategories;
}
