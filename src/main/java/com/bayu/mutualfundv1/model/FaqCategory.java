package com.bayu.mutualfundv1.model;

import com.bayu.mutualfundv1.model.base.BaseEntity;
import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "faq_category", uniqueConstraints = {
        @UniqueConstraint(name = "faq_category_code_unique", columnNames = "category_code")
})
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FaqCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_code")
    private String categoryCode;

    @Column(name = "name")
    private String name;

    @Column(name = "module")
    private String module;

    @Column(name = "title")
    private String title;

}
