package ATM;

import javax.swing.*;
/**
 * Created by user on 08.11.18.
 */
public class Reader {

    String option;
    String login;
    String password;
    String sumDeposit;
    String refillAccount;
    String sumWithrawal;
    String menu = "Select the number of option \n" +
            "1 - CREATE  account \n" +
            "2 - REPLENISH  account \n" +
            "3 - ACCOUNT BALANCE \n" +
            "4 - WITHDRAW money from account\n" +
            "5 - HISTORY of TRANSACTIONS  \n" +
            "7 - Exit";
    String response;
    int responseInnerMenu;

    void insertOption(String request){
        option = JOptionPane.showInputDialog(request);
    }

    void menu(){response = JOptionPane.showInputDialog(menu);}

    void innerMenu(){responseInnerMenu = JOptionPane.showConfirmDialog (null, "Get back to the main menu?");    }

    void insertLogin(){login = JOptionPane.showInputDialog("Set your login");}

    void insertPassword(){
        password = JOptionPane.showInputDialog("Set your password");
    }

    void insertSumDeposit(){
        sumDeposit = JOptionPane.showInputDialog("Set the sum you want to deposit");
    }

    void refillAccount(){
        refillAccount = JOptionPane.showInputDialog("Set the sum your want to add to the account");
    }

    void insertSumWithdrawal(){sumWithrawal = JOptionPane.showInputDialog("Set the sum you want to withdraw");}

    void reply(String reply){
        JOptionPane.showMessageDialog(null, reply);
    }

}
