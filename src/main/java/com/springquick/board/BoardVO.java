package com.springquick.board;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

// VO(Value Object), DTO(Data Transfer Object)
public class BoardVO {
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;
	private String searchCondition;
	private String searchKeyword;
	private MultipartFile uploadFile;
	
	@JsonIgnore
	public String getSearchCondition() { return this.searchCondition; }
	public void setSearchCondition(String _searchCondition) {
		this.searchCondition = _searchCondition;
	}
	
	@JsonIgnore
	public String getSearchKeyword() { return this.searchKeyword; }
	public void setSearchKeyword(String _searchKeyword) {
		this.searchKeyword = _searchKeyword;
	}
	
	
	
	@JsonIgnore
	public MultipartFile getUploadFile() { 
		return uploadFile; 
		}
	
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	
	public int getSeq() { return this.seq; }
	public void setSeq(int _seq) { this.seq = _seq; }
	
	public String getTitle() { return this.title; }
	public void setTitle(String _title) { this.title = _title; }
	
	public String getWriter() { return this.writer; }
	public void setWriter(String _writer) { this.writer = _writer; }
	
	public String getContent() { return this.content; }
	public void setContent(String _content) { this.content = _content; }
	
	public Date getRegDate() { return this.regDate; }
	public void setRegDate(Date _regDate) { this.regDate = _regDate; }
	
	public int getCnt() { return this.cnt; }
	public void setCnt(int _cnt) { this.cnt = _cnt; }
	
	
	@Override
	public String toString() {
		return "BoardVO [seq=" + this.seq + ", title=" + this.title + ", writer=" + this.writer +
				", content=" + this.content + ", regDate=" + this.regDate + ", cnt=" + this.cnt + "]";
	}
}
