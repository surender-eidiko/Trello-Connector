package org.mule.modules.trello.bean;

public class BoardsChecklistPostRequest {
	private String boardId;
	private String name;
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
