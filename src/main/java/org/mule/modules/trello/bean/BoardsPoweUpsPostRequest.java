package org.mule.modules.trello.bean;

public class BoardsPoweUpsPostRequest {
	private String boardId;
	private String value;
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}


	
}
