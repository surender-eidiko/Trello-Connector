package org.mule.modules.trello.bean;

public class OrganizationPutRequest {
	private String name;
	private String displayName;
	private String desc;
	private String website;
	private OrganizationPref pref;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public OrganizationPref getPref() {
		return pref;
	}
	public void setPref(OrganizationPref pref) {
		this.pref = pref;
	}
}
