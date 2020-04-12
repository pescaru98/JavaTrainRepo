package d003.account.processor;

import d003.account.bean.AbstractAccount;

public abstract class AbstractAccountProcessor {
    public AbstractAccount register(AbstractAccount abstractAccount){
        if(abstractAccount.getUsername() != null && abstractAccount.getPassword() != null) return abstractAccount;
        else return null;
    }

    public boolean login(AbstractAccount abstractAccount){
        if(abstractAccount.getUsername().compareToIgnoreCase("mihai") == 0 && abstractAccount.getPassword().compareTo("1234") == 0) return true;
        else return false;
    }

    public abstract void process(AbstractAccount abstractAccount);

    public void displayMessage(){
        System.out.println("AbstractProc display");
    }

    public void displayMessage(String message){
        System.out.println("AbstractProc display: "+message);
    }
}
