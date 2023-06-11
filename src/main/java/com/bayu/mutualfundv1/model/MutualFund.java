package com.bayu.mutualfundv1.model;

import com.bayu.mutualfundv1.model.base.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "mutual_fund")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MutualFund extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name; // Mandiri Pasar Uang

    @Column(name = "category")
    private String category; // Pasar Uang, Pendapatan Tetap, Campuran, Saham

    @Column(name = "investment_management_name")
    private String investmentManagementName; // Mandiri Investasi Management

    @Column(name = "last_nav") // Net Asset Value or Nilai Aktiva Bersih (NAB)
    private BigDecimal lastNav; // 1568.00

    @Column(name = "performance_per_year")
    private String performancePerYear; // 1.58%
}
