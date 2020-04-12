package d003.account.Repository;

import d003.account.bean.AbstractAccount;
import d003.account.bean.Account;

public interface AccountRepository {
    Account getAccount(int account_id);

    void saveAccount(Account account);

    default void process(Account account){
        System.out.println("Processing:"+account.getAccount_id());
    }
}
