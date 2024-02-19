package com.kh.board.domain.post.svc;

import com.kh.board.domain.entity.Post;
import com.kh.board.domain.post.dao.PostDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class PostSVCImpl implements PostSVC {

  private PostDAO postDAO;

  public PostSVCImpl(PostDAO postDAO) {
    this.postDAO = postDAO;
  }

  //작성(추가)
  @Override
  public Long save(Post post) {
    return postDAO.save(post);
  }

  //조회
  @Override
  public Optional<Post> findById(Long postId) {
    return postDAO.findById(postId);
  }

  //수정
  @Override
  public int updateById(Long postId, Post post) {
    return postDAO.updateById(postId, post);
  }

  //삭제
  @Override
  public int deleteById(Long postId) {
    return postDAO.deleteById(postId);
  }

  //목록
  @Override
  public List<Post> findAll() {
    return postDAO.findAll();
  }
}
