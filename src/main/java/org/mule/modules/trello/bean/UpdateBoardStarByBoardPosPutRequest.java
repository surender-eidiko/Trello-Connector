package org.mule.modules.trello.bean;

public class UpdateBoardStarByBoardPosPutRequest {
	
	private String idBoardStar;
	private String value;
	
	public String getIdBoardStar() {
		return idBoardStar;
	}
	public void setIdBoardStar(String idBoardStar) {
		this.idBoardStar = idBoardStar;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
