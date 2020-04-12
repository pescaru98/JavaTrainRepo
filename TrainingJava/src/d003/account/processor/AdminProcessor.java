package d003.account.processor;

import d003.account.bean.AbstractAccount;
import d003.account.bean.AdminAccount;
import d003.account.processor.AbstractAccountProcessor;

public class AdminProcessor extends AbstractAccountProcessor {
    private AdminAccount adminAccount;
    @Override
    public void process(AbstractAccount abstractAccount) {
        if(abstractAccount instanceof AdminAccount){
            adminAccount=(AdminAccount) abstractAccount;
        }
    }

    @Override
    public void displayMessage() {
        System.out.println("AdminProc");
    }

    @Override
    public void displayMessage(String message) {
        System.out.println("AdminProc: "+message);
    }

    public void adminProcMethod(){
        System.out.println("ADMIN OWN METHOD");
    }
}
