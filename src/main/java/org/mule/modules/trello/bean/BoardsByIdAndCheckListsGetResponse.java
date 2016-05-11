package org.mule.modules.trello.bean;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoardsByIdAndCheckListsGetResponse extends StatusResponse {
	private String cards,card_fields,checkItems,checkItem_fields,filter,fields;

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

	public String getCheckItems() {
		return checkItems;
	}

	public void setCheckItems(String checkItems) {
		this.checkItems = checkItems;
	}

	public String getCheckItem_fields() {
		return checkItem_fields;
	}

	public void setCheckItem_fields(String checkItem_fields) {
		this.checkItem_fields = checkItem_fields;
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
