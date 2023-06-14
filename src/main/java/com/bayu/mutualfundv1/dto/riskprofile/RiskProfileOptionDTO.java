package com.bayu.mutualfundv1.dto.riskprofile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RiskProfileOptionDTO {

    private String value; // a, b, c, d

    private String valueText; // text

}
