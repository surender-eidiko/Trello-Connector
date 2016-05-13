package org.mule.modules.trello.bean;

public class PrefsPutRequest {
	
	private Boolean colorBlind;
	private Boolean locale;
	private String minutesBetweenSummaries;
	
	public Boolean getColorBlind() {
		return colorBlind;
	}
	public void setColorBlind(Boolean colorBlind) {
		this.colorBlind = colorBlind;
	}
	public Boolean getLocale() {
		return locale;
	}
	public void setLocale(Boolean locale) {
		this.locale = locale;
	}
	public String getMinutesBetweenSummaries() {
		return minutesBetweenSummaries;
	}
	public void setMinutesBetweenSummaries(String minutesBetweenSummaries) {
		this.minutesBetweenSummaries = minutesBetweenSummaries;
	}
	
	

}
