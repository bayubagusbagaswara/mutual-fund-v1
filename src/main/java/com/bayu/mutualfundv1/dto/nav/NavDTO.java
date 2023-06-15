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
public class NavDTO {

    private String id;

    private String mutualFundCode;

    private String mutualFundName;

    private Instant date;

    private String dateStr;

    private BigDecimal nav;

    private String navStr; // Rp. 1.985,00

}
