package com.example.mypj.content;

import com.example.mypj.DTO.ContentsDto;
import com.example.mypj.database.entity.Contents;
import com.example.mypj.database.repository.ContentsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
@AllArgsConstructor
@Component
public class ContentsServiceImpl implements ContentsService{
    private final ContentsRepository contentsRepository;

//    public ContentsServiceImpl(){
//        this
//    }

    @Override
    public List<Contents> contentList(){
        return contentsRepository.findAll();
    }

    @Override
    public Optional<Contents> selectOneById(Long id){
        return contentsRepository.findById(id);
    }

    @Override
    public List<Contents> findByTitle(String title){  return  contentsRepository.findByTitle(title);}
    @Override
    public void saveContents(ContentsDto contentsDto) {
            Contents contents = Contents.builder()
                    .title(contentsDto.getInputTitle())
                    .description(contentsDto.getInputDescription())
                    .thumbnailImageUrl(contentsDto.getInputImageUrl())
                    .build();
            contentsRepository.save(contents);
    }
    @Override
    public void updateContents(ContentsDto contentsDto, Long idx) {
        Contents contents = Contents.builder()
                .id(idx)
                .title(contentsDto.getInputTitle())
                .description(contentsDto.getInputDescription())
                .thumbnailImageUrl(contentsDto.getInputImageUrl())
                .build();
        contentsRepository.updateContents(contents);
    }
}
