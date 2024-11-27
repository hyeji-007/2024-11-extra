package com.green.board6.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardPutReq {
    private int board_id;
    private String title;
    private String contents;
    private String writer;
}
