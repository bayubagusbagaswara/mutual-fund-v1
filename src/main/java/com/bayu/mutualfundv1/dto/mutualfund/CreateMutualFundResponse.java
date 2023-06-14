package com.bayu.mutualfundv1.dto.mutualfund;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateMutualFundResponse {

    private String id;

    private String name;

    private String category;

    private String investmentManagementName;

    private String lastNav;

    private String performancePerYear;

}
