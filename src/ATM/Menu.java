package ATM;

import java.util.*;
/**
 * Created by user on 08.11.18.
 */
public class Menu {

    public static Account createAccount(){

        Reader r = new Reader();

        r.insertLogin();
        String login = r.login;

        r.insertPassword();
        String password = r.password;

        Account account = new Account(login, password);
//        Account account = new Account();
//        account.setLogin(login);
//        account.setPassword(password);

        Random random = new Random (50000);
        int accountNumber = random.nextInt(1000000000);
        account.setAccountNumber(accountNumber);

        account.setHistory("Account # "+account.getAccountNumber()+" created");

        return account;
    }


    public static Account refillAccount(Account account){

        Account accountInner = account;
        Reader r = new Reader();

        r.refillAccount();
        double sum = Double.parseDouble(r.refillAccount);



        account.setSum(account.getSum()+sum);

        account.setHistory("Account # "+account.getAccountNumber()+" replenished for "+sum+",  CURRENT balance: "+account.getSum());



        return accountInner;
    }

    public static void showDeposit(Account account ){

        Reader r = new Reader();

        r.insertLogin();
        String login = r.login;

        r.insertPassword();
        String password = r.password;

        if (account.getLogin().equals(login)&&account.getPassword().equals(password)){
            String sum = Double.toString(account.getSum());
            r.reply("The sum on your account is "+sum);
        }else {
            r.reply("Wrong input");
            history+="Wrong input login or password \n";
        }
    }

    public static Account withdraw(Account account){

        Account accountInner = account;
        Reader r = new Reader();

        r.insertLogin();
        String login = r.login;

        r.insertPassword();
        String password = r.password;

        if(account.getSum()==0){
            r.reply("You have nothing to withdraw on your account");

        }
        else if (account.getLogin().equals(login)&&account.getPassword().equals(password)){

            r.insertSumWithdrawal();
            if (Double.parseDouble(r.sumWithrawal)>account.getSum()){
                r.reply("The sum on your account is not sufficient!!!");

               // history+="Attempt to withdraw: "+ r.sumWithrawal+"Isufficient BALANCE "+"\n";

            }
            else {
                double sumWithrawal= Double.parseDouble(r.sumWithrawal);
                account.setSum(account.getSum()- sumWithrawal);
                r.reply("Get your money");
                account.setHistory("Sum "+sumWithrawal+" has been taken from your account # "+account.getAccountNumber()+", CURRENT balance: "+account.getSum());
            }
        }else {
            r.reply("Wrong input!!");
            history+="Wrong input login or password \n";
        }


        return accountInner;
    }


    static String history = "History of your transactions: \n";

    public static void menu(Account accountInital){


        Reader r = new Reader();

        r.menu();

        switch (Integer.parseInt(r.response)){

            case (1):{
                accountInital = createAccount();
                account = accountInital;


                history+=account.getHistory()+"\n";
                r.innerMenu();

                if (r.responseInnerMenu ==0){
                    menu(account);
                }else {
                    System.exit(0);

                }

            }
            case (2):{
                if(accountInital.getAccountNumber()==0){
                    r.reply("You have not done any account yet!");

                }else {
                    accountInital = refillAccount(accountInital);
                    account = accountInital;
                    history+=account.getHistory()+"\n";

                }

                r.innerMenu();
                if (r.responseInnerMenu ==0){
                    menu(account);
                }else {
                    System.exit(0);

                }
            }
            case (3):{
                if(accountInital.getAccountNumber()==0){
                    r.reply("You have not done any account yet!");

                }else {
                    showDeposit(account);
                }
                r.innerMenu();
                if (r.responseInnerMenu ==0){
                    menu(account);
                }else {
                    System.exit(0);

                }

            }

            case (4): {
                if(accountInital.getAccountNumber()==0){
                    r.reply("You have not done any account yet!");

                }else {
                    accountInital = withdraw(account);
                    account = accountInital;


                    history+=account.getHistory()+"\n";

                }
                r.innerMenu();
                if (r.responseInnerMenu ==0){
                    menu(account);
                }else {
                    System.exit(0);

                }
            }

            case (5):{

                r.reply(history);
                r.innerMenu();
                if (r.responseInnerMenu ==0){
                    menu(account);
                }else {
                    System.exit(0);

                }
            }

            case (7):{
                System.exit(0);
            }

        }


    }

    private static Account account = new Account(null, null);

    public static void main(String[] args) {

        menu(account);

    }
}
