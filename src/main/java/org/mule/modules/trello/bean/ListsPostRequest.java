package org.mule.modules.trello.bean;

public class ListsPostRequest {
	private String name;
	private String idBoard ;
	private String idListSource ;
	private String pos ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdBoard() {
		return idBoard;
	}
	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}
	public String getIdListSource() {
		return idListSource;
	}
	public void setIdListSource(String idListSource) {
		this.idListSource = idListSource;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	
}
