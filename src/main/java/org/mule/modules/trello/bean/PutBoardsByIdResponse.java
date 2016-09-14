/**
 *
 */
package org.mule.modules.trello.bean;

public class PutBoardsByIdResponse extends StatusResponse {
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	private String descData;
	

	public String getDescData() {
		return descData;
	}

	public void setDescData(String descData) {
		this.descData = descData;
	}
	/** The name. */
	private String name;
	
	/** The desc. */
	private String desc;
	
	/** The closed. */
	private Boolean closed;
	
	/** The subscribed. */
	private Boolean subscribed ;
	
	/** The id organization. */
	private String idOrganization;
	
	/** The prefs. */
	private BoardsPref prefs; 
	
	/** The label names. */
	private LabelNames labelNames;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the desc.
	 *
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	
	/**
	 * Sets the desc.
	 *
	 * @param desc the new desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	/**
	 * Gets the closed.
	 *
	 * @return the closed
	 */
	public Boolean getClosed() {
		return closed;
	}
	
	/**
	 * Sets the closed.
	 *
	 * @param closed the new closed
	 */
	public void setClosed(Boolean closed) {
		this.closed = closed;
	}
	
	/**
	 * Gets the subscribed.
	 *
	 * @return the subscribed
	 */
	public Boolean getSubscribed() {
		return subscribed;
	}
	
	/**
	 * Sets the subscribed.
	 *
	 * @param subscribed the new subscribed
	 */
	public void setSubscribed(Boolean subscribed) {
		this.subscribed = subscribed;
	}
	
	/**
	 * Gets the id organization.
	 *
	 * @return the id organization
	 */
	public String getIdOrganization() {
		return idOrganization;
	}
	
	/**
	 * Sets the id organization.
	 *
	 * @param idOrganization the new id organization
	 */
	public void setIdOrganization(String idOrganization) {
		this.idOrganization = idOrganization;
	}
	
	/**
	 * Gets the prefs.
	 *
	 * @return the prefs
	 */
	public BoardsPref getPrefs() {
		return prefs;
	}
	
	/**
	 * Sets the prefs.
	 *
	 * @param prefs the new prefs
	 */
	public void setPrefs(BoardsPref prefs) {
		this.prefs = prefs;
	}
	
	/**
	 * Gets the label names.
	 *
	 * @return the label names
	 */
	public LabelNames getLabelNames() {
		return labelNames;
	}
	
	/**
	 * Sets the label names.
	 *
	 * @param labelNames the new label names
	 */
	public void setLabelNames(LabelNames labelNames) {
		this.labelNames = labelNames;
	}
	

}
