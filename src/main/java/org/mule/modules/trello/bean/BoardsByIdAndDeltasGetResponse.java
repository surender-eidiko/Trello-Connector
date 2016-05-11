package org.mule.modules.trello.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoardsByIdAndDeltasGetResponse extends StatusResponse {
	
	private String tags,ixLastUpdate;

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getIxLastUpdate() {
		return ixLastUpdate;
	}

	public void setIxLastUpdate(String ixLastUpdate) {
		this.ixLastUpdate = ixLastUpdate;
	}
	
}
