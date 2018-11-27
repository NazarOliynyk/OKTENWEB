package Company_Registration;

import javax.swing.*;
/**
 * Created by user on 27.11.18.
 */
public class Reader {

    void reply(String reply){
        JOptionPane.showMessageDialog(null, reply);
    }

    String responseMainMenu;
    void mainMenu(String request){
        responseMainMenu = JOptionPane.showInputDialog(request);
    }
    String addCompanyName;
    void addCompany(){
        addCompanyName = JOptionPane.showInputDialog("Set the name of a company you want to Create");
    }
    String deleteCompanyName;
    void deleteCompany(){
        deleteCompanyName = JOptionPane.showInputDialog("Set the name of a company you want to Delete");
    }
}
