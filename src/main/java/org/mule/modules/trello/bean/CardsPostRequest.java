package org.mule.modules.trello.bean;

public class CardsPostRequest {
	private String name;
	private String desc;
	private String pos;
	private String due;
	private String idList;
	private String idMembers ;
	private String idLabels;
	private String urlSource;
	private String fileSource ;
	private String idCardSource ;
	private String keepFromSource ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getDue() {
		return due;
	}
	public void setDue(String due) {
		this.due = due;
	}
	public String getIdList() {
		return idList;
	}
	public void setIdList(String idList) {
		this.idList = idList;
	}
	public String getIdMembers() {
		return idMembers;
	}
	public void setIdMembers(String idMembers) {
		this.idMembers = idMembers;
	}
	public String getIdLabels() {
		return idLabels;
	}
	public void setIdLabels(String idLabels) {
		this.idLabels = idLabels;
	}
	public String getUrlSource() {
		return urlSource;
	}
	public void setUrlSource(String urlSource) {
		this.urlSource = urlSource;
	}
	public String getFileSource() {
		return fileSource;
	}
	public void setFileSource(String fileSource) {
		this.fileSource = fileSource;
	}
	public String getIdCardSource() {
		return idCardSource;
	}
	public void setIdCardSource(String idCardSource) {
		this.idCardSource = idCardSource;
	}
	public String getKeepFromSource() {
		return keepFromSource;
	}
	public void setKeepFromSource(String keepFromSource) {
		this.keepFromSource = keepFromSource;
	}
	
}
