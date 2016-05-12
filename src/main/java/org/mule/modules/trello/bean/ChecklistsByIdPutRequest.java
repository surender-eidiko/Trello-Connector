package org.mule.modules.trello.bean;

public class ChecklistsByIdPutRequest {
	private String name;
	private String pos;
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
