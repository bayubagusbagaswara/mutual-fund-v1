package com.bayu.mutualfundv1.dto.faq;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FaqCategoryDTO {

    private String id;

    private String categoryCode;

    private String name;

    private String module;

    private String createdBy;

    private Instant createdDate;

    private String modifiedBy;

    private Instant modifiedDate;

    private List<FaqDTO> faqDTOList;

}
