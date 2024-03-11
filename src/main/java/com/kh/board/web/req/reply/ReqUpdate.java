package com.kh.board.web.req.reply;

import lombok.Data;

@Data
public class ReqUpdate {
  private String replyBody;

  public ReqUpdate() {
  }

  public ReqUpdate(String replyBody) {
    this.replyBody = replyBody;
  }

  public String getReplyBody() {
    return replyBody;
  }

  public void setReplyBody(String replyBody) {
    this.replyBody = replyBody;
  }
}