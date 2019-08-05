package com.hq.gm.entity;

public class Poker {

	private int style = 0; // 牌的款式
	private int value = 0; // 牌的值
	private int number = 0; // 牌的数组
	private int BitpamResID = 0; // 图片资源的
	public boolean ischeck;
	public boolean isTouch = false;
	private boolean isUsed = false;
	

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getBitpamResID() {
		return BitpamResID;
	}

	public void setBitpamResID(int bitpamResID) {
		BitpamResID = bitpamResID;
	}

	public boolean isTouch() {
		return isTouch;
	}

	public void setTouch(boolean isTouch) {
		this.isTouch = isTouch;
	}

}
