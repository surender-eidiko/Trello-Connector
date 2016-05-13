package org.mule.modules.trello.bean;

public class OrganizationMemberDeactivatedPutRequest {
	private String idMember;
	private Boolean value;
	public String getIdMember() {
		return idMember;
	}
	public void setIdMember(String idMember) {
		this.idMember = idMember;
	}
	public Boolean getValue() {
		return value;
	}
	public void setValue(Boolean value) {
		this.value = value;
	}
	
}
