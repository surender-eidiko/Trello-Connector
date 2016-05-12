package org.mule.modules.trello.bean;


public class BoardsByIdPutResponse extends StatusResponse {
	private String id;
	private String name;
	private String desc;
	private Boolean closed;
	private Boolean subscribed;
	private String idOrganization;
	private String prefs;
}
