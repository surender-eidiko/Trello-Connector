package org.mule.modules.trello.bean;

public class ListsByIdPutRequest {
	private String name;
	private String idBoard;
	private Boolean closed;
	private String pos;
	private String subscribed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdBoard() {
		return idBoard;
	}
	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}
	public Boolean getClosed() {
		return closed;
	}
	public void setClosed(Boolean closed) {
		this.closed = closed;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getSubscribed() {
		return subscribed;
	}
	public void setSubscribed(String subscribed) {
		this.subscribed = subscribed;
	}
	
}
