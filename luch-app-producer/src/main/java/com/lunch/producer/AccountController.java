package com.lunch.producer;

import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Logger;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lunch.model.Message;
import com.lunch.model.Order;
import com.lunch.model.PublishResponse;

/**
 * @author 
 *
 */
@RestController
public class AccountController {
/*
	protected Logger logger = Logger.getLogger(AccountController.class.getName());
	
	@Autowired HipChatService hipChatService;

	@CrossOrigin//(origins = "http://localhost:4200")
	@GetMapping("/orders")
	public List<Order> getOrders() throws URISyntaxException, JSONException
	{
		return hipChatService.getOrders();
	}

	@CrossOrigin//(origins = "http://localhost:4200")
	@PostMapping("/menu")
	public PublishResponse publishMenu(@RequestBody Message message) throws URISyntaxException
	{
		return hipChatService.publishMenu(message);
	}
	
	
	@Autowired
	AccountRepository accountRepository;	
	
	@RequestMapping("/accounts")
	public Account[] all() {
		logger.info("accounts-microservice all() invoked");
		List<Account> accounts = accountRepository.getAllAccounts();
		logger.info("accounts-microservice all() found: " + accounts.size());
		return accounts.toArray(new Account[accounts.size()]);
	}
	
	@RequestMapping("/accounts/{id}")
	public Account byId(@PathVariable("id") String id) {
		logger.info("accounts-microservice byId() invoked: " + id);
		Account account = accountRepository.getAccount(id);
		logger.info("accounts-microservice byId() found: " + account);
		return account;
	}
	*/
}
