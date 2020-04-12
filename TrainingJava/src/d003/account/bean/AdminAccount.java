package d003.account.bean;

public class AdminAccount extends AbstractAccount {
    private int token;

    public AdminAccount() {
        super();
    }

    public AdminAccount(int account_id, String username, String password, String email, String name, int token) {
        super(account_id, username, password, email, name);
        this.token = token;
    }

    public AdminAccount(int token) {
        this.token = token;
    }

    @Override
    public void defaultDisplay() {
        System.out.println("Admin display");
    }

    @Override
    public void defaultDisplay(String message) {
        System.out.println("Admin display:" +message);
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "AdminAccount{" +
                "token=" + token +
                '}';
    }


}
