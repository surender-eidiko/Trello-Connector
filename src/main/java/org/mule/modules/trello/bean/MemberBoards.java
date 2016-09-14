/**
 *
 */
package org.mule.modules.trello.bean;

public class MemberBoards {
	private String id;

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdOrganization() {
		return idOrganization;
	}

	public void setIdOrganization(String idOrganization) {
		this.idOrganization = idOrganization;
	}

	public String getPinned() {
		return pinned;
	}

	public void setPinned(String pinned) {
		this.pinned = pinned;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClosed() {
		return closed;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	private String idOrganization;

    private String pinned;

    private String name;

    private String closed;


}
