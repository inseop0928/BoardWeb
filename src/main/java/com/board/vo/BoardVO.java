package com.board.vo;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class BoardVO {
	
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private String searchText;
	private MultipartFile multipartFile;
	
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
	public String getSearchText() {
		return searchText;
	}
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	public MultipartFile getMultipartFile() {
		return multipartFile;
	}
	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}
	
	@Override
	public String toString() {
		return "BoardVO [title=" + title + ", writer=" + writer + ", content=" + content + ", regDate=" + regDate
				+ ", searchText=" + searchText + ", multipartFile=" + multipartFile + "]";
	}
}
