package com.example.mypj.content;

import com.example.mypj.DTO.ContentsDto;
import com.example.mypj.database.entity.Contents;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ContentsService<T> {
    public void saveContents(ContentsDto contentsDto);

    public void updateContents(ContentsDto contentsDto, Long idx);

    Optional<T> selectOneById(Long id);
    List<Contents> contentList();

    List<Contents> findByTitle(String title);

}
