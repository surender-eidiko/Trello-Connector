package org.mule.modules.trello.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActionsByIdGetResponse extends StatusResponse {
	private List<ActionsByIdGetResponse> items = new ArrayList<ActionsByIdGetResponse>();
	  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	public List<ActionsByIdGetResponse> getItems() {
		return items;
	}
	public void setItems(List<ActionsByIdGetResponse> items) {
		this.items = items;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	  
}
