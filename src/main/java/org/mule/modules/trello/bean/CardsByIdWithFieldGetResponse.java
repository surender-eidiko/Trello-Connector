package org.mule.modules.trello.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardsByIdWithFieldGetResponse extends StatusResponse {
	private String cardIdOrShortLink;
	private String field;
	public String getCardIdOrShortLink() {
		return cardIdOrShortLink;
	}
	public void setCardIdOrShortLink(String cardIdOrShortLink) {
		this.cardIdOrShortLink = cardIdOrShortLink;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	
}
