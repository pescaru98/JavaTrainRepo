package d003.account.bean;

public class UserAccount extends AbstractAccount {
    private int userType;

    @Override
    public void defaultDisplay() {
        System.out.println("User display");
    }

    public UserAccount(int userType) {
        this.userType = userType;
    }

    public UserAccount(int account_id, String username, String password, String email, String name, int userType) {
        super(account_id, username, password, email, name);
        this.userType = userType;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }


}
