package org.mule.modules.trello.bean;

public class BoardsByIdPutRequest {
	private String name;
	private String desc;
	private Boolean closed;
	private Boolean subscribed ;
	private String idOrganization;
	private BoardsPref prefs; 
	private LabelNames labelNames;
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
	public Boolean getClosed() {
		return closed;
	}
	public void setClosed(Boolean closed) {
		this.closed = closed;
	}
	public Boolean getSubscribed() {
		return subscribed;
	}
	public void setSubscribed(Boolean subscribed) {
		this.subscribed = subscribed;
	}
	public String getIdOrganization() {
		return idOrganization;
	}
	public void setIdOrganization(String idOrganization) {
		this.idOrganization = idOrganization;
	}
	public BoardsPref getPrefs() {
		return prefs;
	}
	public void setPrefs(BoardsPref prefs) {
		this.prefs = prefs;
	}
	public LabelNames getLabelNames() {
		return labelNames;
	}
	public void setLabelNames(LabelNames labelNames) {
		this.labelNames = labelNames;
	}
	

}
