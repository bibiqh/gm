package com.hq.gm.entity;

import java.util.List;
import java.util.Map;

public class GameRoomRuleDetail {

	private String roomDetail; // 房间说明
	private List<Map<String, String>> prizeGoods; // 奖励物品
	private List<Map<String, String>> applyTerm; // 报名条件
	private List<Map<String, String>> applyFee; // 报名费用
	private int limitNum=0; // 开赛人数
	private Map<String, String> applyRoom; // 排位赛对应普通房间
	private String timeDesc; // 赛场时间说明
	private String timeText; // 赛场时间文本
	private int  applyNum=0;	// 报名人数


	public Map<String, String> getApplyRoom() {
		return applyRoom;
	}

	public void setApplyRoom(Map<String, String> applyRoom) {
		this.applyRoom = applyRoom;
	}

	public String getRoomDetail() {
		return roomDetail;
	}

	public void setRoomDetail(String roomDetail) {
		this.roomDetail = roomDetail;
	}

	public List<Map<String, String>> getPrizeGoods() {
		return prizeGoods;
	}

	public void setPrizeGoods(List<Map<String, String>> prizeGoods) {
		this.prizeGoods = prizeGoods;
	}

	public List<Map<String, String>> getApplyTerm() {
		return applyTerm;
	}

	public void setApplyTerm(List<Map<String, String>> applyTerm) {
		this.applyTerm = applyTerm;
	}

	public List<Map<String, String>> getApplyFee() {
		return applyFee;
	}

	public void setApplyFee(List<Map<String, String>> applyFee) {
		this.applyFee = applyFee;
	}

	public int getLimitNum() {
		return limitNum;
	}

	public void setLimitNum(int limitNum) {
		this.limitNum = limitNum;
	}

	public final String getTimeDesc() {
		return timeDesc;
	}

	public final void setTimeDesc(String timeDesc) {
		this.timeDesc = timeDesc;
	}

	public final String getTimeText() {
		return timeText;
	}

	public final void setTimeText(String timeText) {
		this.timeText = timeText;
	}

	public final int getApplyNum() {
		return applyNum;
	}

	public final void setApplyNum(int applyNum) {
		this.applyNum = applyNum;
	}

}
