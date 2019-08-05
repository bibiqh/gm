package com.hq.gm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hq.gm.entity.ClientData;
import com.hq.gm.entity.ClientUser;
import com.hq.gm.rule.Rule;

@RestController
@RequestMapping("/poker")
public class TestController {

	@GetMapping("/issueCards")
	public String issueCards(){
		List<ClientUser> users = new ArrayList<ClientUser>();
		ClientUser user = new ClientUser();
		user.setOrder(0);
		user.setName("老大");
		user.setCallPoint(100000);
		users.add(user);
		ClientUser user1 = new ClientUser();
		user1.setOrder(1);
		user1.setName("老二");
		user1.setCallPoint(100000);
		users.add(user1);
		ClientUser user2 = new ClientUser();
		user2.setOrder(2);
		user2.setName("老三");
		user2.setCallPoint(100000);
		users.add(user2);
		ClientData data = new com.hq.gm.entity.ClientData(new ArrayList<>(), users, 1);
		ClientData issueCards = Rule.issueCards(data);
		return issueCards.toString();
	}
}
