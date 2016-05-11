package org.mule.modules.trello.bean;

public class CardsStickerPutRequest {
	String idSticker;
	String top;
	String left;
	String zIndex;
	public String getIdSticker() {
		return idSticker;
	}
	public void setIdSticker(String idSticker) {
		this.idSticker = idSticker;
	}
	public String getTop() {
		return top;
	}
	public void setTop(String top) {
		this.top = top;
	}
	public String getLeft() {
		return left;
	}
	public void setLeft(String left) {
		this.left = left;
	}
	public String getzIndex() {
		return zIndex;
	}
	public void setzIndex(String zIndex) {
		this.zIndex = zIndex;
	}
	public String getRotate() {
		return rotate;
	}
	public void setRotate(String rotate) {
		this.rotate = rotate;
	}
	String rotate;
}
