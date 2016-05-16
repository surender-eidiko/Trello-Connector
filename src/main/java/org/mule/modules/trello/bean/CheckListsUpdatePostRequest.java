package org.mule.modules.trello.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class CheckListsUpdatePostRequest.
 */
public class CheckListsUpdatePostRequest {
	
	/** The value. */
	String value;
	
	/** The name. */
	String name;
	
	/** The id checklist source. */
	String idChecklistSource ;
	
	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
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
	 * Gets the id checklist source.
	 *
	 * @return the id checklist source
	 */
	public String getIdChecklistSource() {
		return idChecklistSource;
	}
	
	/**
	 * Sets the id checklist source.
	 *
	 * @param idChecklistSource the new id checklist source
	 */
	public void setIdChecklistSource(String idChecklistSource) {
		this.idChecklistSource = idChecklistSource;
	}
	
}
