package org.mule.modules.trello.bean;

public class ChecklistsPostRequest {
	private String idCard ;
	private String name;
	private String pos;
	private String idChecklistSource ;
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getIdChecklistSource() {
		return idChecklistSource;
	}
	public void setIdChecklistSource(String idChecklistSource) {
		this.idChecklistSource = idChecklistSource;
	}
	
}
