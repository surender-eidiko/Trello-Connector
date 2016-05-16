
package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class OrganizationPref.
 */
public class OrganizationPref {
	
	/** The org invite restrict. */
	private String orgInviteRestrict;
	
	/** The external members disabled. */
	private Boolean externalMembersDisabled;
	
	/** The associated domain. */
	private String associatedDomain;
	
	/** The google apps version. */
	private Integer googleAppsVersion;
	
	/** The board visibility restrict. */
	private BoardVisibilityRestrict boardVisibilityRestrict;
	
	/** The permission level. */
	private String permissionLevel;
	
	/**
	 * Gets the org invite restrict.
	 *
	 * @return the org invite restrict
	 */
	public String getOrgInviteRestrict() {
		return orgInviteRestrict;
	}
	
	/**
	 * Sets the org invite restrict.
	 *
	 * @param orgInviteRestrict the new org invite restrict
	 */
	public void setOrgInviteRestrict(String orgInviteRestrict) {
		this.orgInviteRestrict = orgInviteRestrict;
	}
	
	/**
	 * Gets the external members disabled.
	 *
	 * @return the external members disabled
	 */
	public Boolean getExternalMembersDisabled() {
		return externalMembersDisabled;
	}
	
	/**
	 * Sets the external members disabled.
	 *
	 * @param externalMembersDisabled the new external members disabled
	 */
	public void setExternalMembersDisabled(Boolean externalMembersDisabled) {
		this.externalMembersDisabled = externalMembersDisabled;
	}
	
	/**
	 * Gets the associated domain.
	 *
	 * @return the associated domain
	 */
	public String getAssociatedDomain() {
		return associatedDomain;
	}
	
	/**
	 * Sets the associated domain.
	 *
	 * @param associatedDomain the new associated domain
	 */
	public void setAssociatedDomain(String associatedDomain) {
		this.associatedDomain = associatedDomain;
	}
	
	/**
	 * Gets the google apps version.
	 *
	 * @return the google apps version
	 */
	public Integer getGoogleAppsVersion() {
		return googleAppsVersion;
	}
	
	/**
	 * Sets the google apps version.
	 *
	 * @param googleAppsVersion the new google apps version
	 */
	public void setGoogleAppsVersion(Integer googleAppsVersion) {
		this.googleAppsVersion = googleAppsVersion;
	}
	
	/**
	 * Gets the board visibility restrict.
	 *
	 * @return the board visibility restrict
	 */
	public BoardVisibilityRestrict getBoardVisibilityRestrict() {
		return boardVisibilityRestrict;
	}
	
	/**
	 * Sets the board visibility restrict.
	 *
	 * @param boardVisibilityRestrict the new board visibility restrict
	 */
	public void setBoardVisibilityRestrict(
			BoardVisibilityRestrict boardVisibilityRestrict) {
		this.boardVisibilityRestrict = boardVisibilityRestrict;
	}
	
	/**
	 * Gets the permission level.
	 *
	 * @return the permission level
	 */
	public String getPermissionLevel() {
		return permissionLevel;
	}
	
	/**
	 * Sets the permission level.
	 *
	 * @param permissionLevel the new permission level
	 */
	public void setPermissionLevel(String permissionLevel) {
		this.permissionLevel = permissionLevel;
	}
	
	
}
