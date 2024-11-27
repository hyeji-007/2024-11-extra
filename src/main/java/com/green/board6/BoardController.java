package com.green.board6;

import com.green.board6.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;

    @PostMapping
    public int postBoard(@RequestBody BoardPostReq p) {
        return service.postBoard(p);
    }

    @GetMapping
    public List<BoardGetRes> getBoardList() {
        return service.getBoardList();
    }

    @GetMapping("{boardId}")
    public BoardGetOneRes getBoardOne(@PathVariable int boardId) {
        return service.getBoardOne(boardId);
    }

    @PutMapping
    public int putBoard(@RequestBody BoardPutReq p) {
        return service.putBoard(p);
    }

    @DeleteMapping
    public int delBoard(@ModelAttribute BoardDelReq p) {
        return service.delBoard(p);
    }

}
