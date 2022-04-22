package com.codestatesddd.domain.board.service;

import com.codestatesddd.domain.board.entity.BoardEntity;
import com.codestatesddd.domain.board.entity.CommentEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {

    public List<BoardEntity> getBoardList(){
        System.out.println("게시글 리스트 불러오기");
        return new ArrayList<>();
    }

    public BoardEntity saveBoard() {
        System.out.println("게시글 쓰기");
        return new BoardEntity();
    }
    public BoardEntity getBoard(){
        System.out.println("게시글 읽기");
        return new BoardEntity();
    }
    public int deleteBoard(){
        System.out.println("게시글 삭제");
        return 0;
    }
    public CommentEntity saveComment() {
        System.out.println("댓글 쓰기");
        return new CommentEntity();
    }
    public List<CommentEntity> getComment(){
        System.out.println("댓글 읽기");
        return new ArrayList<>();
    }
    public int deleteComment(){
        System.out.println("댓글 삭제");
        return 0;
    }
}
