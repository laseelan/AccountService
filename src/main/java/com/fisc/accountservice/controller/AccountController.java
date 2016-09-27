package com.fisc.accountservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fisc.accountservice.core.AccountService;
import com.fisc.accountservice.model.User;

@RestController
public class AccountController {

	private static final Logger log = LoggerFactory.getLogger(AccountController.class);

	private AccountService service;

	public AccountController(AccountService service) {
		this.service = service;
	}
	
	@RequestMapping(path = "/account/{id}", method = RequestMethod.GET)
	public User account(@PathVariable Long id) throws Exception {
		return service.getAccount(id);
	}
	
	@RequestMapping(path = "/account", method = RequestMethod.GET)
	public User accountByUserId(@RequestParam String userId) throws Exception {
		return service.getAccountBy(userId);
	}
}
