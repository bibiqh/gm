package com.hq.gm.entity;

import java.util.ArrayList;
import java.util.List;

public class ClientData {
	private int masterStart;
	private List<ClientUser> users;
	private List<Integer> lastCards = new ArrayList<Integer>();
	
	public List<ClientUser> getUsers() {
		return users;
	}
	public void setUsers(List<ClientUser> users) {
		this.users = users;
	}
	public List<Integer> getLastCards() {
		return lastCards;
	}
	public void setLastCards(List<Integer> lastCards) {
		this.lastCards = lastCards;
	}
	public int getMasterStart() {
		return masterStart;
	}
	public void setMasterStart(int masterStart) {
		this.masterStart = masterStart;
	}
	public ClientData(List<Integer> lastCards, List<ClientUser> users, int masterStart){
		this.masterStart = masterStart;
		this.users = users;
		this.lastCards = lastCards;
	}
	
	@Override
	public String toString() {
		return "ClientData [masterStart=" + masterStart + ", users=" + users + ", lastCards=" + lastCards + "]";
	}

}
