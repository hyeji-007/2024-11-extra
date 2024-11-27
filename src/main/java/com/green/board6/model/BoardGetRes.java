package com.green.board6.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardGetRes {
    private int board_id;
    private String title;
    private String writer;
    private String created_at;
}
