package d003.account;

import d003.account.Repository.AccountRepository;
import d003.account.Repository.DiskAccountRepository;

public class MainInterface {
    public static void main(String[] args) {
        AccountRepository accountRepository = new DiskAccountRepository();
        System.out.println(accountRepository.getAccount(1));
    }
}
