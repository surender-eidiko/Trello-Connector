package org.mule.modules.trello.bean;

public class SessionStatusByIdPutRequest {
	private String value;
	private String idSession;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getIdSession() {
		return idSession;
	}
	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}
	
}
