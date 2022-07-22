package com.example.mypj.content;

import com.example.mypj.database.entity.Contents;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/api/contents")
public class ContentsApiController {

    private final ContentsServiceImpl contentsService;

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
