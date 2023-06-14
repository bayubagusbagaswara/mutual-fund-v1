package com.bayu.mutualfundv1.dto.riskprofile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RiskProfileSimulationRequest {

    private String branchCode;

    private String email;

    private List<QuestionnaireRequest> questionnaireRequestList;
}
