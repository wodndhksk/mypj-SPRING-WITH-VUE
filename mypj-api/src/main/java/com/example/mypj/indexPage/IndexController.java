package com.example.mypj.indexPage;

import com.example.mypj.content.ContentsServiceImpl;
import com.example.mypj.database.entity.Contents;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class IndexController {
    private final ContentsServiceImpl contentService;

    @GetMapping (value="/")
    public String index(Model model) {
        model.addAttribute("contentList", contentService.contentList());
        return "index";
    }

    @GetMapping (value="/api/test")
    public ResponseEntity<List<Contents>> indexApi(Model model) {

        return ResponseEntity.ok().body(contentService.contentList());
    }
}
