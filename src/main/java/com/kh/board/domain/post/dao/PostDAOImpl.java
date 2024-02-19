package com.kh.board.domain.post.dao;


import com.kh.board.domain.entity.Post;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Repository
public class PostDAOImpl implements PostDAO {

  private final NamedParameterJdbcTemplate template;

  PostDAOImpl(NamedParameterJdbcTemplate template) {
    this.template = template;
  }

  //작성(추가)
  @Override
  public Long save(Post post) {
    StringBuffer sql = new StringBuffer();
    sql.append("insert into post(post_id, post_title, post_body, writer) ");
    sql.append("values(post_post_id_seq.nextval, :postTitle, :postBody, :writer) ");

    SqlParameterSource param = new BeanPropertySqlParameterSource(post);
    KeyHolder keyHolder = new GeneratedKeyHolder();

    template.update(sql.toString(), param, keyHolder, new String[]{"post_id", "post_title", "post_body", "writer"});
    Long post_id = ((BigDecimal) keyHolder.getKeys().get("post_id")).longValue();

    return post_id;
  }

  //조회
  @Override
  public Optional<Post> findById(Long postId) {
    StringBuffer sql = new StringBuffer();
    sql.append("select post_id, post_title, writer, post_body, cdate, udate ");
    sql.append("  from post ");
    sql.append(" where post_id = :postId");

    try {
      Map<String, Long> map = Map.of("postId", postId);
      Post post = template.queryForObject(sql.toString(), map, BeanPropertyRowMapper.newInstance(Post.class));
      return Optional.of(post);
    } catch (EmptyResultDataAccessException e) {
      // 조회결과 X
      return Optional.empty();
    }
  }

  //수정
  @Override
  public int updateById(Long postId, Post post) {
    StringBuffer sql = new StringBuffer();
    sql.append("update post ");
    sql.append("   set post_title = :postTitle, ");
    sql.append("       writer = :writer, ");
    sql.append("       post_body = :postBody, ");
    sql.append("       udate = default ");
    sql.append(" where post_id = :postId ");

    SqlParameterSource param = new MapSqlParameterSource()
        .addValue("postTitle", post.getPostTitle())
        .addValue("writer", post.getWriter())
        .addValue("postBody", post.getPostBody())
        .addValue("postId", postId);

    int updateRowCnt = template.update(sql.toString(), param);
    return updateRowCnt;
  }

  //삭제
  @Override
  public int deleteById(Long postId) {
    StringBuffer sql = new StringBuffer();
    sql.append("delete from post ");
    sql.append(" where post_id = :postId ");

    SqlParameterSource param = new MapSqlParameterSource()
        .addValue("postId", postId);

    int deletedRowCnt = template.update(sql.toString(), param);
    return deletedRowCnt;
  }

  //목록
  @Override
  public List<Post> findAll() {
    StringBuffer sql = new StringBuffer();
    sql.append("  select post_id, post_title, post_body, writer, cdate, udate ");
    sql.append("    from post ");
    sql.append("order by post_id desc ");

    List<Post> list = template.query(sql.toString(), BeanPropertyRowMapper.newInstance(Post.class));

    return list;
  }
}
