package org.mule.modules.trello.bean;

public class ListsCardsPostRequest {
	private String name;
	private String desc;
	private String labels;
	private String idMembers ;
	private String due;
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
	public String getLabels() {
		return labels;
	}
	public void setLabels(String labels) {
		this.labels = labels;
	}
	public String getIdMembers() {
		return idMembers;
	}
	public void setIdMembers(String idMembers) {
		this.idMembers = idMembers;
	}
	public String getDue() {
		return due;
	}
	public void setDue(String due) {
		this.due = due;
	}
	
}
