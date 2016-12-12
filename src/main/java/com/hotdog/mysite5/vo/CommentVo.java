package com.hotdog.mysite5.vo;

public class CommentVo {
	private Long no;
	private String content;
	private String reg_date;
	private Long users_no;
	private Long board_no;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public Long getUsers_no() {
		return users_no;
	}
	public void setUsers_no(Long users_no) {
		this.users_no = users_no;
	}
	public Long getBoard_no() {
		return board_no;
	}
	public void setBoard_no(Long board_no) {
		this.board_no = board_no;
	}
	@Override
	public String toString() {
		return "CommentVo [no=" + no + ", content=" + content + ", reg_date=" + reg_date + ", users_no=" + users_no
				+ ", board_no=" + board_no + "]";
	}
	
	
	
}
