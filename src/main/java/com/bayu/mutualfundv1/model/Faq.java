package com.bayu.mutualfundv1.model;

import com.bayu.mutualfundv1.model.base.BaseEntity;
import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "faq", uniqueConstraints = {
        @UniqueConstraint(name = "faq_code_unique", columnNames = "code")
})
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Faq extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "question")
    private String question;

    @Column(name ="answer", length = 1000)
    private String answer;

    @Column(name = "seen_by_user") // mostSearched atau searchVolume
    private Integer seenByUser; // 100, 99, 98, 97

    @Column(name = "category_code")
    private String categoryCode;

}
