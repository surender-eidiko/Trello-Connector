package org.mule.modules.trello.bean;

public class CardsCurrentCheckListPutRequest {
	private String idChecklistCurrent ;
	private String idCheckItem ;
	private String name ;
	private String state;
	private String idChecklist ;
	private String pos ;
	public String getIdChecklistCurrent() {
		return idChecklistCurrent;
	}
	public void setIdChecklistCurrent(String idChecklistCurrent) {
		this.idChecklistCurrent = idChecklistCurrent;
	}
	public String getIdCheckItem() {
		return idCheckItem;
	}
	public void setIdCheckItem(String idCheckItem) {
		this.idCheckItem = idCheckItem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getIdChecklist() {
		return idChecklist;
	}
	public void setIdChecklist(String idChecklist) {
		this.idChecklist = idChecklist;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	
	
}
