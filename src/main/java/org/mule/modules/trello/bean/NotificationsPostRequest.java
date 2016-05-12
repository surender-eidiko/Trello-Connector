package org.mule.modules.trello.bean;

public class NotificationsPostRequest {
	private Boolean display;private	Boolean entities;
	private String fields;
	private String memberCreator;
	private String memberCreator_fields;
	private Boolean board;
	private String board_fields;
	private Boolean list;private Boolean card;
	private String card_fields;
	private Boolean organization;
	private String  organization_fields;
	private Boolean member;
	private String member_fields;
	public Boolean getDisplay() {
		return display;
	}
	public void setDisplay(Boolean display) {
		this.display = display;
	}
	public Boolean getEntities() {
		return entities;
	}
	public void setEntities(Boolean entities) {
		this.entities = entities;
	}
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getMemberCreator() {
		return memberCreator;
	}
	public void setMemberCreator(String memberCreator) {
		this.memberCreator = memberCreator;
	}
	public String getMemberCreator_fields() {
		return memberCreator_fields;
	}
	public void setMemberCreator_fields(String memberCreator_fields) {
		this.memberCreator_fields = memberCreator_fields;
	}
	public Boolean getBoard() {
		return board;
	}
	public void setBoard(Boolean board) {
		this.board = board;
	}
	public String getBoard_fields() {
		return board_fields;
	}
	public void setBoard_fields(String board_fields) {
		this.board_fields = board_fields;
	}
	public Boolean getList() {
		return list;
	}
	public void setList(Boolean list) {
		this.list = list;
	}
	public Boolean getCard() {
		return card;
	}
	public void setCard(Boolean card) {
		this.card = card;
	}
	public String getCard_fields() {
		return card_fields;
	}
	public void setCard_fields(String card_fields) {
		this.card_fields = card_fields;
	}
	public Boolean getOrganization() {
		return organization;
	}
	public void setOrganization(Boolean organization) {
		this.organization = organization;
	}
	public String getOrganization_fields() {
		return organization_fields;
	}
	public void setOrganization_fields(String organization_fields) {
		this.organization_fields = organization_fields;
	}
	public Boolean getMember() {
		return member;
	}
	public void setMember(Boolean member) {
		this.member = member;
	}
	public String getMember_fields() {
		return member_fields;
	}
	public void setMember_fields(String member_fields) {
		this.member_fields = member_fields;
	}
}
