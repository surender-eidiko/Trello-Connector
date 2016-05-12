package org.mule.modules.trello.bean;

public class WebhooksByIdPutRequest {
	private String description;
	private String callbackURL;
	private String idModel;
	private Boolean active;
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
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
}
