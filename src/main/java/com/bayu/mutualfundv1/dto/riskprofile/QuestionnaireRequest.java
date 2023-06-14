package com.bayu.mutualfundv1.dto.riskprofile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuestionnaireRequest {

    // data single questionnaire yang kita kirim untuk mendapatkan risk profile simulation
    private String questionNo;

    private String type;

    private String answer;
}
