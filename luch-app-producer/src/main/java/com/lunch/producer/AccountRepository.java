package com.lunch.producer;

import java.util.List;

/**
 * @author
 *
 */
public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}
