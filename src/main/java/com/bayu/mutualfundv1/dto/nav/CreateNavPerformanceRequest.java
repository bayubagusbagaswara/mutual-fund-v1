package com.bayu.mutualfundv1.dto.nav;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateNavPerformanceRequest {

    @NotBlank
    private String mutualFundCode;

    // cari tau cara convert date to string, dan juga string to date
    private String date; // 25-Jan-2023 atau 2023/01/25

    // cari tau cara convert big decimal to string, dan string to big decimal
    private String nav; // Rp 1.580,00
}
