package org.mule.modules.trello.bean;

public class ListsMovedCardsPostRequest {
	private String idBoard;
	private String idList;
	public String getIdBoard() {
		return idBoard;
	}
	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}
	public String getIdList() {
		return idList;
	}
	public void setIdList(String idList) {
		this.idList = idList;
	}
	
}
