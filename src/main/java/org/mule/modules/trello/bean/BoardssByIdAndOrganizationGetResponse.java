package org.mule.modules.trello.bean;

public class BoardssByIdAndOrganizationGetResponse extends StatusResponse {
	private String boardId,fields;

	public String getBoardId() {
		return boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	
	
}
