package org.comstudy21.myweb.board;

import java.io.Serializable;
import java.sql.Date;

//VO(Value Object)
public class BoardVO implements Serializable {
	private int seq;
	private String sendid;
	private String receiveid;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private String keyword;

	public BoardVO() {
		this(0, "", "", "", "", "", null, "");
	}

	public BoardVO(int seq) {
		this(seq, "", "", "", "", "", null, "");
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getSendid() {
		return sendid;
	}

	public void setSendid(String sendid) {
		this.sendid = sendid;
	}

	public String getReceiveid() {
		return receiveid;
	}

	public void setReceiveid(String receiveid) {
		this.receiveid = receiveid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", sendid=" + sendid + ", receiveid=" + receiveid + ", title=" + title
				+ ", writer=" + writer + ", content=" + content + ", regDate=" + regDate + ", keyword=" + keyword + "]";
	}

	public BoardVO(int seq, String sendid, String receiveid, String title, String writer, String content, Date regDate,
			String keyword) {
		this.seq = seq;
		this.sendid = sendid;
		this.receiveid = receiveid;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = regDate;
		this.keyword = keyword;
	}
}