package com.example.mypj.database.entity.category;

import lombok.Data;

import javax.persistence.*;

@Data
public class CategoryLanguage {

    /**
     * 언어구분코드(PK)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_LANG_ID")
    private Long id;

    /**
     * 카테고리번호(FK)
     */
    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @Column
    private String categoryName;
}
