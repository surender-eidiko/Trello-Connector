package org.mule.modules.trello.bean;

public class UpdateSavedSearchQueryPutRequest {
	
	private String idSavedSearch;
	private String value;
	
	public String getIdSavedSearch() {
		return idSavedSearch;
	}
	public void setIdSavedSearch(String idSavedSearch) {
		this.idSavedSearch = idSavedSearch;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
