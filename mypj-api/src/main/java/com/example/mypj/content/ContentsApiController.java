package com.example.mypj.content;

import com.example.mypj.database.entity.Contents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contents")
public class ContentsApiController {

    private final ContentsService contentsService;

    @Autowired
    public ContentsApiController(ContentsServiceImpl contentsService) {
        this.contentsService = contentsService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Contents>> getContentList(){
        List<Contents> contentList = contentsService.contentList();
        return ResponseEntity.ok().body(contentList);
    }

    @PostMapping("/find-by-title")
    public ResponseEntity<List<Contents>> getSearchContents(@RequestParam String title){
        List<Contents> contentList = contentsService.findByTitle(title);
        return ResponseEntity.ok().body(contentList);
    }
}
