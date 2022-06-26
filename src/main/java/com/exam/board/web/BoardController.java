package com.exam.board.web;

import com.exam.board.dto.BoardDto;
import com.exam.board.entity.Board;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/boards")
    public List<Board> boardList() {
        return null;
    }

    @GetMapping("/board/dto")
    public BoardDto boardDto(@RequestParam("title") String title, @RequestParam("content") String content) {
        return BoardDto.builder().title(title).content(content).build();
    }
}
