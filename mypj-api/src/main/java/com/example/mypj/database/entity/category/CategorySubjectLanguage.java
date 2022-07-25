package com.example.mypj.database.entity.category;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_category_sub_lang")
public class CategorySubjectLanguage {
    /**
     * 언어구분코드(PK)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    /**
     * 카테고리번호(FK)
     */
    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    /**
     * 품목명
     */
    @Column
    private String subjectName;
}
