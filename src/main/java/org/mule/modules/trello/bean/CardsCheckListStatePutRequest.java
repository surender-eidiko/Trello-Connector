package org.mule.modules.trello.bean;

public class CardsCheckListStatePutRequest {
	private String idChecklist ;
	private String idCheckItem ;
	private String value ;
	public String getIdChecklist() {
		return idChecklist;
	}
	public void setIdChecklist(String idChecklist) {
		this.idChecklist = idChecklist;
	}
	public String getIdCheckItem() {
		return idCheckItem;
	}
	public void setIdCheckItem(String idCheckItem) {
		this.idCheckItem = idCheckItem;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
