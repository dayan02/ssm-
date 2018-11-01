package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.AccountService;
import bean.Accounting;
import dao.AccountDao;
@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDao ad;
	@Override
	public void remit(String from, String to, double money) {
		Accounting fromAccount=ad.findMoneyByName(from);
		fromAccount.setMoney(fromAccount.getMoney()-money);
		ad.update(fromAccount);
		Accounting toAccount=ad.findMoneyByName(to);
		toAccount.setMoney(toAccount.getMoney()+money);
		ad.update(toAccount);
	}

}
