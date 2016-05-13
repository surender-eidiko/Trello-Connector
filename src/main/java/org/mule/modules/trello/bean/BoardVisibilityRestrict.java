package org.mule.modules.trello.bean;

import org.codehaus.jackson.annotate.JsonProperty;

public class BoardVisibilityRestrict {
	@JsonProperty(value="private")
	private String privateValue;
	private String org;
	@JsonProperty(value="public")
	private String publicValue;
	public String getPrivateValue() {
		return privateValue;
	}
	public void setPrivateValue(String privateValue) {
		this.privateValue = privateValue;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getPublicValue() {
		return publicValue;
	}
	public void setPublicValue(String publicValue) {
		this.publicValue = publicValue;
	}
	
}
