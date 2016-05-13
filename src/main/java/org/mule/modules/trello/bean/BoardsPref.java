package org.mule.modules.trello.bean;

public class BoardsPref {
	private String permissionLevel;
	private Boolean selfJoin;
	private Boolean cardCovers;
	private String invitations;
	private String voting;
	private String comments;
	private String background;
	private String cardAging;
	private Boolean calendarFeedEnabled;
	public String getPermissionLevel() {
		return permissionLevel;
	}
	public void setPermissionLevel(String permissionLevel) {
		this.permissionLevel = permissionLevel;
	}
	public Boolean getSelfJoin() {
		return selfJoin;
	}
	public void setSelfJoin(Boolean selfJoin) {
		this.selfJoin = selfJoin;
	}
	public Boolean getCardCovers() {
		return cardCovers;
	}
	public void setCardCovers(Boolean cardCovers) {
		this.cardCovers = cardCovers;
	}
	public String getInvitations() {
		return invitations;
	}
	public void setInvitations(String invitations) {
		this.invitations = invitations;
	}
	public String getVoting() {
		return voting;
	}
	public void setVoting(String voting) {
		this.voting = voting;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	public String getCardAging() {
		return cardAging;
	}
	public void setCardAging(String cardAging) {
		this.cardAging = cardAging;
	}
	public Boolean getCalendarFeedEnabled() {
		return calendarFeedEnabled;
	}
	public void setCalendarFeedEnabled(Boolean calendarFeedEnabled) {
		this.calendarFeedEnabled = calendarFeedEnabled;
	}
	
}
