package org.mule.modules.trello.bean;

public class CheckListsUpdatePostRequest {
	String value;
	String name;
	String idChecklistSource ;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdChecklistSource() {
		return idChecklistSource;
	}
	public void setIdChecklistSource(String idChecklistSource) {
		this.idChecklistSource = idChecklistSource;
	}
	
}
