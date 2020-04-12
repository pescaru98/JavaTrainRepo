package d003.account.Repository;

import d003.account.bean.AbstractAccount;
import d003.account.bean.Account;

public class DiskAccountRepository implements AccountRepository{
    @Override
    public Account getAccount(int account_id) {
        return new Account();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("Saved To Disk");
    }

}
