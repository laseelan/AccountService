package com.fisc.accountservice.core;

import org.springframework.stereotype.Service;

import com.fisc.accountservice.model.User;
import com.fisc.accountservice.repository.AccountRepository;

@Service
class AccountServiceImpl implements AccountService {

	private AccountRepository repository;
	
	public AccountServiceImpl(AccountRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public User getAccount(Long id) {
		return repository.findOne(id);
	}
	
	@Override
	public User getAccountBy(String userId) {
		return repository.findByUserId(userId);
	}
}
