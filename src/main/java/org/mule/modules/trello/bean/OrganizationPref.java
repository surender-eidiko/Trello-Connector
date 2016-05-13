package org.mule.modules.trello.bean;

public class OrganizationPref {
	private String orgInviteRestrict;
	private Boolean externalMembersDisabled;
	private String associatedDomain;
	private Integer googleAppsVersion;
	private BoardVisibilityRestrict boardVisibilityRestrict;
	private String permissionLevel;
	public String getOrgInviteRestrict() {
		return orgInviteRestrict;
	}
	public void setOrgInviteRestrict(String orgInviteRestrict) {
		this.orgInviteRestrict = orgInviteRestrict;
	}
	public Boolean getExternalMembersDisabled() {
		return externalMembersDisabled;
	}
	public void setExternalMembersDisabled(Boolean externalMembersDisabled) {
		this.externalMembersDisabled = externalMembersDisabled;
	}
	public String getAssociatedDomain() {
		return associatedDomain;
	}
	public void setAssociatedDomain(String associatedDomain) {
		this.associatedDomain = associatedDomain;
	}
	public Integer getGoogleAppsVersion() {
		return googleAppsVersion;
	}
	public void setGoogleAppsVersion(Integer googleAppsVersion) {
		this.googleAppsVersion = googleAppsVersion;
	}
	public BoardVisibilityRestrict getBoardVisibilityRestrict() {
		return boardVisibilityRestrict;
	}
	public void setBoardVisibilityRestrict(
			BoardVisibilityRestrict boardVisibilityRestrict) {
		this.boardVisibilityRestrict = boardVisibilityRestrict;
	}
	public String getPermissionLevel() {
		return permissionLevel;
	}
	public void setPermissionLevel(String permissionLevel) {
		this.permissionLevel = permissionLevel;
	}
	
	
}
