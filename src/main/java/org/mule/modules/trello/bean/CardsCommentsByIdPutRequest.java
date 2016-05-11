package org.mule.modules.trello.bean;

public class CardsCommentsByIdPutRequest {
	private String idAction;
	private String text;
	public String getIdAction() {
		return idAction;
	}
	public void setIdAction(String idAction) {
		this.idAction = idAction;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
