package com.kh.board.web;

import com.kh.board.domain.entity.Post;
import com.kh.board.domain.post.dao.PostDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class PostControllerTest {

  @Autowired
  PostDAO postDAO;

  @Test
  @DisplayName("게시판")
  void findAll() {
    List<Post> list = postDAO.findAll();
    for (Post post : list) {
      log.info("post={}",post);
    }
    log.info("size={}",list.size());
  }
}