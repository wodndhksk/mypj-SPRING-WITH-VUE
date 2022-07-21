package com.example.mypj.content;

import com.example.mypj.database.entity.Contents;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Member;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/api/contents")
public class ContentsApiController {

    private final ContentsServiceImpl contentsService;

    @GetMapping("/find-by-title")
    public ResponseEntity<List<Contents>> getAccountList(){
        List<Contents> contentList = contentsService.contentList();
        return ResponseEntity.ok().body(contentList);
    }
}
