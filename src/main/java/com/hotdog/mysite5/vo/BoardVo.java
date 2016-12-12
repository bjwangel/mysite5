package com.hotdog.mysite5.vo;

public class BoardVo {
	private Long no;
	private String title;
	private String reg_date;
	private String content;
	private String filename;
	private int category;
	private Long users_no;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public Long getUsers_no() {
		return users_no;
	}
	public void setUsers_no(Long users_no) {
		this.users_no = users_no;
	}
	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", title=" + title + ", reg_date=" + reg_date + ", content=" + content
				+ ", filename=" + filename + ", category=" + category + ", users_no=" + users_no + "]";
	}
	
	
	
	
	
}
