package org.mule.modules.trello.bean;

public class CardsByIdPutRequest {
	private String name;
	private String desc;
	private Boolean closed;
	private String idMembers;
	private String idAttachmentCover;
	private String idList;
	private String idBoard;
	private String pos;
	private String due;
	private Boolean subscribed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Boolean getClosed() {
		return closed;
	}
	public void setClosed(Boolean closed) {
		this.closed = closed;
	}
	public String getIdMembers() {
		return idMembers;
	}
	public void setIdMembers(String idMembers) {
		this.idMembers = idMembers;
	}
	public String getIdAttachmentCover() {
		return idAttachmentCover;
	}
	public void setIdAttachmentCover(String idAttachmentCover) {
		this.idAttachmentCover = idAttachmentCover;
	}
	public String getIdList() {
		return idList;
	}
	public void setIdList(String idList) {
		this.idList = idList;
	}
	public String getIdBoard() {
		return idBoard;
	}
	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getDue() {
		return due;
	}
	public void setDue(String due) {
		this.due = due;
	}
	public Boolean getSubscribed() {
		return subscribed;
	}
	public void setSubscribed(Boolean subscribed) {
		this.subscribed = subscribed;
	}
	
}
