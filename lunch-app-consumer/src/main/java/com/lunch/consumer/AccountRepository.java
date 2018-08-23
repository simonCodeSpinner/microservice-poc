/**
 * 
 */
package com.lunch.consumer;

import java.util.List;

import com.lunch.model.Order;

/**
 * @author
 *
 */
public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
	
	List<Order> getOrders();
}
