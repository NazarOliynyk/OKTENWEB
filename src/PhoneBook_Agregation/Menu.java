package PhoneBook_Agregation;

import java.util.Iterator;
import java.util.TreeSet;

public class Menu {

    public static User findUser
            (TreeSet<User> userTreeSet, String name, String surname){
        Reader r = new Reader();

        User userSelected=new User();
        if(userTreeSet.isEmpty()){
            r.reply("You have not added any user yet!");
            menu(users);
        }else {

            for (User user : userTreeSet) {
                if (user.getName().equals(name)||user.getSurname().equals(surname)){
                    userSelected=user;
                    break;
                }
            }
            if (userSelected.getName() == null&&userSelected.getSurname()==null){
                r.reply("No such user - "+name+"  "+surname+"!");
                menu(users);
            }
        }
        return userSelected;
    }

    public static TreeSet<PhoneNumber> findNumberSet
            (TreeSet<User> userTreeSet, String name, String surname){

        Reader r = new Reader();
        User userSelected=new User();
        TreeSet<PhoneNumber> numberTreeSet = new TreeSet<>();

        if(userTreeSet.isEmpty()){
            r.reply("You have not added any user yet!");
            menu(users);
        }else {

            for (User user : userTreeSet) {
                if (user.getName().equals(name)||user.getSurname().equals(surname)){
                    userSelected=user;
                    numberTreeSet=user.getNumberTreeSet();
                    break;
                }
            }
            if (userSelected.getName() == null&&userSelected.getSurname()==null){
                r.reply("No such user - "+name+"  "+surname+"!");
                menu(users);
            }
            else if(numberTreeSet==null){
                numberTreeSet = new TreeSet<>();
            }

        }
        return numberTreeSet;
    }

    public static PhoneNumber findPhoneNumber
            (TreeSet<PhoneNumber> numberTreeSet, String type){

        Reader r = new Reader();

        PhoneNumber number = new PhoneNumber();

        if(numberTreeSet.isEmpty()){
            r.reply("You have not added any number yet!");
            menu(users);
        }else {
            for (PhoneNumber phoneNumber : numberTreeSet) {
                if (phoneNumber.getTypeOfNumber().equals(type)){

                    number=phoneNumber;
                }
            }
            if (number.getTypeOfNumber()==null){
                r.reply("No such number - "+type+"!");
            }
        }
        return number;
    }

    public static TreeSet<User> addUser
            (TreeSet<User> users, String name, String surname){
        User user = new User();
        TreeSet<PhoneNumber> numberTreeSet = new TreeSet<>();
        user.setName(name);
        user.setSurname(surname);
        user.setNumberTreeSet(numberTreeSet);
        users.add(user);
        System.out.println(users);
        return users;

    }

    public static TreeSet<User> deleteUser(TreeSet<User> users, String name, String surname){

        Reader r = new Reader();

        User userSelected=null;
        if(users.isEmpty()){
            r.reply("You have not added any user yet!");
            menu(users);
        }else {
            Iterator<User> iterator = users.iterator();
            while (iterator.hasNext()){
                User next = iterator.next();
                if(next.getName().equals(name)||next.getSurname().equals(surname)){
                    userSelected = next;
                    iterator.remove();
                }
            }
            if (userSelected.getName()==null&&userSelected.getSurname()==null){
                r.reply("No such user - "+name+"  "+surname+"!");
                menu(users);
            }

        }
        return users;
    }

    public static TreeSet<User> addPhoneNumber
            (TreeSet<User> users, String name, String surname, String type, int number){
        Reader r = new Reader();

        User userSelected;
        TreeSet<PhoneNumber> numberTreeSet ;
        PhoneNumber phoneNumber = new PhoneNumber();
        if(users.isEmpty()){
            r.reply("You have not added any user yet!");
            menu(users);
        }else {
            userSelected = findUser(users, name, surname);
            numberTreeSet = userSelected.getNumberTreeSet();
            phoneNumber.setTypeOfNumber(type);
            phoneNumber.setNumber(number);
            numberTreeSet.add(phoneNumber);
            userSelected.setNumberTreeSet(numberTreeSet);
            users.add(userSelected);
        }
       //ystem.out.println("users");
        return users;

    }

    public static TreeSet<User> changePhoneNumber
            (TreeSet<User> users, String name, String surname, String type, int number){
        Reader r = new Reader();

        User userSelected;
        TreeSet<PhoneNumber> numberTreeSet ;
        PhoneNumber phoneNumber ;
        if(users.isEmpty()){
            r.reply("You have not added any user yet!");
            menu(users);
        }else {
            userSelected = findUser(users, name, surname);
            numberTreeSet = findNumberSet(users, name, surname);
            phoneNumber=findPhoneNumber(numberTreeSet, type);
            phoneNumber.setNumber(number);
            if(phoneNumber.getTypeOfNumber()==null){
                menu(users);
            }
            numberTreeSet.add(phoneNumber);
            userSelected.setNumberTreeSet(numberTreeSet);
            users.add(userSelected);
        }

        return users;
    }

    public static TreeSet<User> deleteAllNumbersOfUser
            (TreeSet<User> users, String name, String surname){
        Reader r = new Reader();

        User userSelected;
        TreeSet<PhoneNumber> numberTreeSet ;
        if(users.isEmpty()){
            r.reply("You have not added any user yet!");
            menu(users);
        }else {
            userSelected = findUser(users, name, surname);
            numberTreeSet = userSelected.getNumberTreeSet();
            if(numberTreeSet.isEmpty()){
                r.reply("User "+name+"  "+surname+" has not added any numbers yet");
                menu(users);
            }else {
                numberTreeSet = new TreeSet<>();
                userSelected.setNumberTreeSet(numberTreeSet);
                users.add(userSelected);
            }
        }

        return users;
    }

    public static TreeSet<User> deletePhoneNumber
            (TreeSet<User> users, String name, String surname, String type){
        Reader r = new Reader();

        User userSelected;
        TreeSet<PhoneNumber> numberTreeSet;
        PhoneNumber phoneNumber = null;
        if(users.isEmpty()){
            r.reply("You have not added any user yet!");
            menu(users);
        }else {
            userSelected = findUser(users, name, surname);
            numberTreeSet = findNumberSet(users, name, surname);
            Iterator<PhoneNumber> iterator = numberTreeSet.iterator();
            while (iterator.hasNext()){
                PhoneNumber number = iterator.next();
                if(number.getTypeOfNumber().equals(type)){
                    phoneNumber = number;
                    iterator.remove();
                }
            }
            userSelected.setNumberTreeSet(numberTreeSet);
            users.add(userSelected);
        }
            if (phoneNumber==null){
                r.reply("No such number "+type);
            }
        return users;
    }

    public static void printPhoneNumbersOfUser
            (TreeSet<User> users, String name, String surname) {
        Reader r = new Reader();
        TreeSet<PhoneNumber> numberTreeSet = null;
        String reply = "These are the phone numbers of a user - "+name+"  "+surname+  "\n";
        if(users.isEmpty()){
            r.reply("You have not added any user yet!");
            menu(users);
        }else {
            numberTreeSet = findNumberSet(users, name, surname);
            for (PhoneNumber phoneNumber : numberTreeSet) {
                reply+=phoneNumber.toString()+"\n";
            }
        }r.reply(reply);
    }

    public static void printPhoneBook(TreeSet<User> users){
        Reader r = new Reader();
        String reply = "This is your phone book: \n";
        int i=1;
        if(users.isEmpty()){
            r.reply("You have not added any user yet!");
            menu(users);
        }else {
            for (User user : users) {
                reply+= "User #"+i+". "+user.getName()+"  "+user.getSurname()+"\n";
                printPhoneNumbersOfUser(users, user.getName(), user.getSurname());
                i++;
            }
        }r.reply(reply);
    }

    public static TreeSet<User> menu(TreeSet<User> users){

        Reader r = new Reader();
        r.menu();
        if(r.response==null){
            System.exit(0);
        }
        else {int response=0;
            try {
                response = Integer.parseInt(r.response);
            }catch (NumberFormatException e){
                r.reply("Type numbers only!!");
                menu(users);
            }

            switch (response) {
                case 1:{
                    r.getUser();
                    String name = r.name;
                    String surname = r.surName;
                    if (name==null||surname==null){
                        menu(users);
                    }else {
                        users = addUser(users, name, surname);
                        menu(users);
                    } break;
                }
                case 2:{
                    r.setNumber();
                    String name = r.name2;
                    String surname = r.surName2;
                    String typeOfNumber = r.typeOfNumber2;

                    if (name==null||surname==null||typeOfNumber==null||r.number==null){
                        menu(users);
                    }else {int number=0;
                        try {
                            number = Integer.parseInt(r.number);
                        }catch (NumberFormatException e){
                            r.reply("Type numbers only!!");
                            menu(users);
                            break;
                        }
                        users = addPhoneNumber(users, name, surname, typeOfNumber, number);
                        menu(users);
                    } break;

                }
                case 3:{
                    r.getUser();
                    String name = r.name;
                    String surname = r.surName;
                    if (name==null||surname==null){
                        menu(users);
                    }else {
                        users = deleteUser(users, name, surname);
                        menu(users);
                    }break;
                }
                case 4:{
                    r.getUser();
                    String name = r.name;
                    String surname = r.surName;

                    if (name==null||surname==null){
                        menu(users);
                    }
                    else {
                        users = deleteAllNumbersOfUser(users, name, surname);
                        menu(users);
                    }break;
                }
                case 5:{
                    r.getNumber();
                    String name = r.name1;
                    String surname = r.surName1;
                    String typeOfNumber = r.typeOfNumber1;
                    if (name==null||surname==null||typeOfNumber==null){
                        menu(users);
                    }else {
                        users = deletePhoneNumber(users, name, surname, typeOfNumber);
                        menu(users);
                    }break;
                }
                case 6:{
                    r.changeNumber();
                    String name = r.name3;
                    String surname = r.surName3;
                    String typeOfNumber = r.typeOfNumber3;
                    if (name==null||surname==null||typeOfNumber==null||r.number3==null){
                        menu(users);
                    }else {int number=0;
                        try {
                            number = Integer.parseInt(r.number3);
                        }catch (NumberFormatException e){
                            r.reply("Type numbers only!!");
                            menu(users);
                            break;
                        }
                        users = changePhoneNumber(users, name, surname, typeOfNumber, number);
                        menu(users);
                    } break;
                }
                case 7:{
                    printPhoneBook(users);
                    menu(users);
                    break;
                }
                case 8:{
                    r.getUser();
                    String name = r.name;
                    String surname = r.surName;
                    if (name==null||surname==null){
                        menu(users);
                    }else {
                        printPhoneNumbersOfUser(users, name, surname);
                        menu(users);
                    } break;
                }
                case 9:{
                    System.exit(0);
                }

            }

        }

        return users;
    }

    static TreeSet<User> users = new TreeSet<>();

    public static void main(String[] args) {
        menu(users);
    }
}
