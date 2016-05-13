package org.mule.modules.trello.bean;

public class BoardsMembersByMemberIdPutRequest {
	private String idMember;
	private String type;
	public String getIdMember() {
		return idMember;
	}
	public void setIdMember(String idMember) {
		this.idMember = idMember;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
