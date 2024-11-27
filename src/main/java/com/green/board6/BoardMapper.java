package com.green.board6;

import com.green.board6.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardPostReq p);
    List<BoardGetRes> selBoardList();
    BoardGetOneRes selBoardOne(int boardId);
    int updBoard(BoardPutReq p);
    int delBoard(BoardDelReq p);
}
