package com.bayu.mutualfundv1.dto.mutualfund;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MutualFundListDTO {

    private List<MutualFundDTO> mutualFundList;
}
