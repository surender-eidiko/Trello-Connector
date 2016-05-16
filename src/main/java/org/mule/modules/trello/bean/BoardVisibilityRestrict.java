/**
 *
 */
package org.mule.modules.trello.bean;

import org.codehaus.jackson.annotate.JsonProperty;

// TODO: Auto-generated Javadoc
/**
 * The Class BoardVisibilityRestrict.
 */
public class BoardVisibilityRestrict {
	
	/** The private value. */
	@JsonProperty(value="private")
	private String privateValue;
	
	/** The org. */
	private String org;
	
	/** The public value. */
	@JsonProperty(value="public")
	private String publicValue;
	
	/**
	 * Gets the private value.
	 *
	 * @return the private value
	 */
	public String getPrivateValue() {
		return privateValue;
	}
	
	/**
	 * Sets the private value.
	 *
	 * @param privateValue the new private value
	 */
	public void setPrivateValue(String privateValue) {
		this.privateValue = privateValue;
	}
	
	/**
	 * Gets the org.
	 *
	 * @return the org
	 */
	public String getOrg() {
		return org;
	}
	
	/**
	 * Sets the org.
	 *
	 * @param org the new org
	 */
	public void setOrg(String org) {
		this.org = org;
	}
	
	/**
	 * Gets the public value.
	 *
	 * @return the public value
	 */
	public String getPublicValue() {
		return publicValue;
	}
	
	/**
	 * Sets the public value.
	 *
	 * @param publicValue the new public value
	 */
	public void setPublicValue(String publicValue) {
		this.publicValue = publicValue;
	}
	
}
