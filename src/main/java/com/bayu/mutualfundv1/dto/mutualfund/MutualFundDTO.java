package com.bayu.mutualfundv1.dto.mutualfund;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MutualFundDTO {

    private String id;

    private String name; // Mandiri Pasar Uang

    private String category; // Pasar Uang

    private String investmentManagementName; // Mandiri Investasi

    private String nab; // Rp 1.568,0

    private String navPerformance; // 1.58%

}
