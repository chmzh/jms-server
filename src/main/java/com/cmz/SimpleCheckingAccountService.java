package com.cmz;

public class SimpleCheckingAccountService implements CheckingAccountService {

	public void cancelAccount(Long accountId) {
		System.out.println("Cancelling account [" + accountId + "]");
	}

}
