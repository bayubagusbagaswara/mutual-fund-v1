package com.bayu.mutualfundv1.dto.riskprofile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserQuestionnaire {

    private String userId;

    private String question;

    private String answer;
//
//    "BranchCode": "ID0010123”,
//            "Email": "nama@mail.com",
//            "CustomerID": "123",
//            "_Questionnaire":
//            "[{\"QuestionNo\":1,\"Answer\":\"E\",\"Type\":\"RISK\"},{\"QuestionNo\":11,\"Answer\
//":\"A\",\"Type\":\"KYCO\"},{\"QuestionNo\":12,\"Answer\":\"B\",\"Type\":\"KYCI\"}]"
}
