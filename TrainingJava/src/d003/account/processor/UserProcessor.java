package d003.account.processor;

import d003.account.bean.AbstractAccount;
import d003.account.bean.UserAccount;
import d003.account.processor.AbstractAccountProcessor;

public class UserProcessor extends AbstractAccountProcessor {
    private UserAccount userAccount;
    @Override
    public void process(AbstractAccount abstractAccount) {
        if(abstractAccount instanceof UserAccount) userAccount = (UserAccount) abstractAccount;
    }

    @Override
    public void displayMessage() {
        System.out.println("UserProc");
    }

    @Override
    public void displayMessage(String message) {
        System.out.println("UserProc: "+message);
    }

    public void userProcMethod(){
        System.out.println("USER OWN METHOD");
    }
}
