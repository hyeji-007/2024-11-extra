package com.green.board6.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardGetOneRes {
    private int board_id;
    private String title;
    private String writer;
    private String contents;
    private String created_at;
}
