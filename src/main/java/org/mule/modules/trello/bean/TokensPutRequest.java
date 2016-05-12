package org.mule.modules.trello.bean;

public class TokensPutRequest {
	private String description;
	private String callbackURL;
	private String idModel;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCallbackURL() {
		return callbackURL;
	}
	public void setCallbackURL(String callbackURL) {
		this.callbackURL = callbackURL;
	}
	public String getIdModel() {
		return idModel;
	}
	public void setIdModel(String idModel) {
		this.idModel = idModel;
	}
	
}
