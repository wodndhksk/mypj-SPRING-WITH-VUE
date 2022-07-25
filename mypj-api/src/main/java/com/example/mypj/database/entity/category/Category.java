package com.example.mypj.database.entity.category;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_category")
public class Category {
    /**
     * 카테고리번호(PK)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID")
    private Long id;

    /**
     * 노출영역코드
     */
    @Column
    private String code;
    /**
     * 정렬순서
     */
    @Column
    private Long sort;
    /**
     * 사용여부
     */
    @Column
    private String useYn;
    /**
     * 설명
     */
    @Column
    private String description;
}
