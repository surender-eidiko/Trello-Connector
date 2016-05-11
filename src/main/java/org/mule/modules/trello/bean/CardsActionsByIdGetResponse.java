package org.mule.modules.trello.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardsActionsByIdGetResponse extends StatusResponse {

	String cardIdOrShortlink;
	Boolean entities;
	Boolean display;
	String filter;
	String fields;
	Integer limit;
	String format;
	String since;
	String before;
	String idModels;
	Boolean member;
	String member_fields;
	Boolean  memberCreator;
	String memberCreator_fields;
}
