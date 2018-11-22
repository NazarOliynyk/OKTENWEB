package ATM;


/**
 * Created by user on 08.11.18.
 */
public class Account {

    private String login;
    private String password;
    private int accountNumber;
    private double sum;

    private String history;

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                ", password=" + password +
                ", accountNumber=" + accountNumber +
                ", sum=" + sum +
                '}';
    }
}

