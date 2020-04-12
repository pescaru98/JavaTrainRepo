package d003.account.bean;

public abstract class AbstractAccount {
    private int account_id;
    private String username;
    private String password;
    private String email;
    private String name;

    public AbstractAccount() {
    }

    public AbstractAccount(int account_id, String username, String password, String email, String name) {
        this.account_id = account_id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public int getAccount_id() {
        return account_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void defaultDisplay(){
        System.out.println("Abstract message");
    }

    public void defaultDisplay(String message){
        System.out.println("Abstract message: "+message);
    }

    @Override
    public String toString() {
        return "AbstractAccount{" +
                "account_id=" + account_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
