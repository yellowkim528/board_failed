package com.kh.board.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post {

  private Long   postId;         // 글번호   POST_ID	   NUMBER(10,0)
  private String postTitle ;     // 글제목   POST_TITLE VARCHAR2(2000 BYTE)
  private String postBody;       // 글내용   POST_BODY	 CLOB
  private String writer ;        // 작성자   WRITER	   VARCHAR2(30 BYTE)
  private LocalDateTime cdate;   // 작성날짜 CDATE	     TIMESTAMP(6)
  private LocalDateTime udate;   // 수정날짜 UDATE	     TIMESTAMP(6)
}
