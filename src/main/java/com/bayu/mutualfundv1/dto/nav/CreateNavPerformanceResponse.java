package com.bayu.mutualfundv1.dto.nav;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateNavPerformanceResponse {

    private String mutualFundCode;

    private String mutualFundName;

    private Instant date;

    private String dateStr; // format: 1 Jan 2023

    private BigDecimal nav;

    private String navStr; // Rp. 1.985,00

}
