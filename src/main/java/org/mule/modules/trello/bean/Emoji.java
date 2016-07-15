package org.mule.modules.trello.bean;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize
public class Emoji {
private String id;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

}
