package org.mule.modules.trello.bean;

public class CheckListsToCardByIdPostRequest {
	private String idChecklist ;
	
	public String getIdChecklist() {
		return idChecklist;
	}

	public void setIdChecklist(String idChecklist) {
		this.idChecklist = idChecklist;
	}

	public String getIdCheckItem() {
		return idCheckItem;
	}

	public void setIdCheckItem(String idCheckItem) {
		this.idCheckItem = idCheckItem;
	}

	private String idCheckItem ;
	
}
