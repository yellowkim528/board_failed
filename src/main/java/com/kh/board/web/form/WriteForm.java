package com.kh.board.web.form;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class WriteForm {
  @NotEmpty(message = "제목을 입력해주세요")
  private String postTitle;
  @NotEmpty(message = "작성자를 입력해주세요")
  private String writer;
  @NotEmpty(message = "내용을 입력해주세요")
  private String postBody;
}
