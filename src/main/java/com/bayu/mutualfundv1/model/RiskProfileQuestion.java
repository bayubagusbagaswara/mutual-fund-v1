package com.bayu.mutualfundv1.model;

import com.bayu.mutualfundv1.model.base.BaseEntity;
import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "risk_profile_question", uniqueConstraints = {
        @UniqueConstraint(name = "risk_profile_question_number_unique", columnNames = "number")
})
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RiskProfileQuestion extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private String number; // 1, 2, 3, 4, etc

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "language")
    private String language;

}
