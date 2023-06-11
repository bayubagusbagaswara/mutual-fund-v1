package com.bayu.mutualfundv1.model;

import com.bayu.mutualfundv1.model.base.BaseEntity;
import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "risk_profile_answer")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RiskProfileAnswer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value", length = 2)
    private String value; // a, b, c, d, e

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    // relasi menggunakan question_number
    @Column(name = "question_number")
    private String questionNumber;
}
