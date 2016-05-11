package org.mule.modules.trello.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoardsByIdAndListsGetResponse extends StatusResponse {
	private String cards,card_fields,filter,fields;

	public String getCards() {
		return cards;
	}

	public void setCards(String cards) {
		this.cards = cards;
	}

	public String getCard_fields() {
		return card_fields;
	}

	public void setCard_fields(String card_fields) {
		this.card_fields = card_fields;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	
}
