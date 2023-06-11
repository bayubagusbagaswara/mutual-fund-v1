package com.bayu.mutualfundv1.model;

import com.bayu.mutualfundv1.model.base.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "nav_performance", uniqueConstraints = {
        @UniqueConstraint(name = "nav_performance_date_unique", columnNames = "date")
})
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NavPerformance extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // sebagai relasi ManyToOne dengan table Mutual Fund
    @Column(name = "mutual_fund_code", nullable = false)
    private String mutualFundCode;

    @Column(name = "mutual_fund_name", nullable = false)
    private String mutualFundName;

    // tanggal harus uniq, karena 1 tanggal hanya memiliki 1 nav
    @Column(name = "date")
    private Instant date;

    @Column(name = "date_str")
    private String dateStr; // format: 1 Jan 2023

    @Column(name = "nav")
    private BigDecimal nav;

    @Column(name = "nav_str")
    private String navStr; // Rp. 1.985,00
}
