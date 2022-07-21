package com.example.mypj.database.repository;

import com.example.mypj.database.entity.Contents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContentsRepository extends JpaRepository<Contents, Long> {
    public List<Contents> findAll();
    public List<Contents> findByTitle(String title);
    Optional<Contents> findById(Long id);
    @Transactional
    @Modifying
    @Query("UPDATE Contents set title = :#{#paramContent.title}, description=:#{#paramContent.description}, thumbnailImageUrl=:#{#paramContent.thumbnailImageUrl} WHERE id = :#{#paramContent.id}")
    void updateContents(@Param("paramContent") Contents contents);


//    @Query("SELECT * FROM 'tbl_contents' WHERE title LIKE  :#{#title}")
//    List<Contents> void findByTitle(@Param("title") String title);
}
