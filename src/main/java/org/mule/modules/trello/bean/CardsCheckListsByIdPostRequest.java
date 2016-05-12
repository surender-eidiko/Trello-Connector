package org.mule.modules.trello.bean;

public class CardsCheckListsByIdPostRequest {
	private String idChecklist ;
	private String name;
	private String pos;
	public String getIdChecklist() {
		return idChecklist;
	}
	public void setIdChecklist(String idChecklist) {
		this.idChecklist = idChecklist;
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
	 
}
