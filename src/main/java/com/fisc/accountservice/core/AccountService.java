package com.fisc.accountservice.core;

import com.fisc.accountservice.model.User;

public interface AccountService {

	public User getAccount(Long id);
	
	public User getAccountBy(String userId);
}
