package org.mule.modules.trello.bean;

public class BoardsMembershipsPutRequest {
	private String idMembership;
	private String type;
	private String member_fields;
	public String getIdMembership() {
		return idMembership;
	}
	public void setIdMembership(String idMembership) {
		this.idMembership = idMembership;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMember_fields() {
		return member_fields;
	}
	public void setMember_fields(String member_fields) {
		this.member_fields = member_fields;
	}
	
}
