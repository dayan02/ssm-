package dao;

import bean.Accounting;

public interface AccountDao {
	public void update(Accounting a);
	public Accounting findMoneyByName(String name);
}	
