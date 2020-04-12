package d003.account;

import d003.account.bean.AbstractAccount;
import d003.account.bean.AdminAccount;
import d003.account.processor.AbstractAccountProcessor;
import d003.account.processor.AdminProcessor;
import d003.account.processor.UserProcessor;

public class MainAccount {
    public static void main(String[] args) {
        //=======================================================================

        AbstractAccountProcessor abstractAccountProcessor = new AdminProcessor();
        abstractAccountProcessor.displayMessage();
        abstractAccountProcessor.displayMessage("Mesaj Admin");

        abstractAccountProcessor = new UserProcessor();
        abstractAccountProcessor.displayMessage();
        abstractAccountProcessor.displayMessage("Mesaj user");


        //===========================UPCASTING=======================================

        AdminProcessor adminProcessor = new AdminProcessor();
        adminProcessor.displayMessage();
        AbstractAccountProcessor abstractAccountProcessor1 = (AbstractAccountProcessor) adminProcessor;
        abstractAccountProcessor1.displayMessage();

        //===========================DOWNCASTING=======================================
        AbstractAccountProcessor abstractAccountProcessor2 = new AdminProcessor();
        AdminProcessor adminProcessor1 = (AdminProcessor)abstractAccountProcessor2;
        adminProcessor1.adminProcMethod();
    }
}
