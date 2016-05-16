package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class CheckItemsPostRequest.
 */
public class CheckItemsPostRequest {
	
	/** The name. */
	private String name;
	
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
	 * Gets the pos.
	 *
	 * @return the pos
	 */
	public String getPos() {
		return pos;
	}
	
	/**
	 * Sets the pos.
	 *
	 * @param pos the new pos
	 */
	public void setPos(String pos) {
		this.pos = pos;
	}
	
	/**
	 * Gets the checked.
	 *
	 * @return the checked
	 */
	public Boolean getChecked() {
		return checked;
	}
	
	/**
	 * Sets the checked.
	 *
	 * @param checked the new checked
	 */
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	
	/** The pos. */
	private String pos;
	
	/** The checked. */
	private Boolean checked;
}
