package com.example.mypj.database.entity.category;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_category_sub")
public class CategorySubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_SUB_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;
    /**
     * 정렬순서
     */
    @Column
    private Long Sort;
    /**
     * 사용여부
     */
    @Column
    private String useYn;
    /**
     * HSCODE
     */
    @Column
    private String hsCode;
    /**
     * 관세율
     */
    @Column
    private Long tariffRate;
    /**
     * 부가세율
     */
    @Column
    private Long vatRate;
    /**
     * 특소세율
     */
    @Column
    private Long specialTaxRate;
    /**
     * 기준초과금
     */
    @Column
    private Long standardOverage;
    /**
     * 교육세율
     */
    @Column
    private Long educationTaxRate;
    /**
     * 농특세율
     */
    @Column
    private Long specialAgriculturalTaxRate;
    /**
     * 주세율
     */
    @Column
    private Long stateTaxRate;
    /**
     * 통관구분코드
     */
    @Column
    private Long CustomsClearanceNumber;
}
