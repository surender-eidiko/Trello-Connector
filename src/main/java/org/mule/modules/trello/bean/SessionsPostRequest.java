package org.mule.modules.trello.bean;

public class SessionsPostRequest {
	private String status;
	private String idBoard;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIdBoard() {
		return idBoard;
	}
	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}
	
}
