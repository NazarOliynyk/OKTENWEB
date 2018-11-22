package PhoneBook_Map;

import java.util.*;
/**
 * Created by user on 16.11.18.
 */

public class Menu {

    public static TreeMap<User, TreeSet<PhoneNumber>> addUser
            (TreeMap<User, TreeSet<PhoneNumber>> map, String name, String surname){

        map.put(new User(name, surname), new TreeSet<PhoneNumber>());
        return map;
    }

    public static TreeMap<User, TreeSet<PhoneNumber>> addPhoneNumber
            (TreeMap<User, TreeSet<PhoneNumber>> map, String name, String surName, String typeOfNumber, int number ){

        Reader r = new Reader();
        if(map.isEmpty()){
            r.reply("You have not added any user yet!");
        }else {
            for (Map.Entry<User, TreeSet<PhoneNumber>> userTreeSetEntry : map.entrySet()) {

                if (userTreeSetEntry.getKey().getName().equals(name) || userTreeSetEntry.getKey().getSurname().equals(surName)) {
                    userTreeSetEntry.getValue().add(new PhoneNumber(typeOfNumber, number));
                }
//                else if(!(userTreeSetEntry.getKey().getName().equals(name)) && !(userTreeSetEntry.getKey().getSurname().equals(surName))){
//                    r.reply("No such user "+name+"  "+surName);
//
//                }
            }
        }
        return map;
    }




    public static void printPhoneBook(TreeMap<User, TreeSet<PhoneNumber>> map){
        Reader r = new Reader();
        String response = "Your phone book contains: \n";
        if(map.isEmpty()){
            response+="Empty set";
            r.reply(response);
        }else {
            for (Map.Entry<User, TreeSet<PhoneNumber>> userTreeSetEntry : map.entrySet()) {
                response += "Name -" + userTreeSetEntry.getKey().getName() + "\n";
                response += "Surname- " + userTreeSetEntry.getKey().getSurname() + "\n";

                for (Object o : userTreeSetEntry.getValue().toArray()) {
                    response += o.toString() + "\n";

                }
            }
            r.reply(response);
        }
    }

    public static void printPhoneBookOfUser(TreeMap<User, TreeSet<PhoneNumber>> map, String name, String surname){
        Reader r = new Reader();
        String response = "Your phone book of a user  " +name+"  "+surname+" contains numbers: \n";
        if(map.isEmpty()){
            response+="Empty set";
            r.reply(response);
        }else {
            for (Map.Entry<User, TreeSet<PhoneNumber>> userTreeSetEntry : map.entrySet()) {

                if (userTreeSetEntry.getKey().getName().equals(name) || userTreeSetEntry.getKey().getSurname().equals(surname)) {
//
                    for (Object o : userTreeSetEntry.getValue().toArray()) {
                        response += o.toString() + "\n";

                    }
                }
            }r.reply(response);
        }
    }

    public static TreeMap<User, TreeSet<PhoneNumber>> deleteUser
            (TreeMap<User, TreeSet<PhoneNumber>> map, String name, String surName){
        Reader r = new Reader();
        if(map.isEmpty()){
            r.reply("You have not added any user yet!");
        }else {
            Set<Map.Entry<User, TreeSet<PhoneNumber>>> entries = map.entrySet();
            Iterator<Map.Entry<User, TreeSet<PhoneNumber>>> iterator = entries.iterator();
            while (iterator.hasNext()) {
                Map.Entry<User, TreeSet<PhoneNumber>> next = iterator.next();
                if (next.getKey().getName().equals(name) || next.getKey().getSurname().equals(surName)) {
                    iterator.remove();
                }
            }
        }
        return map;
    }


    public static TreeMap<User, TreeSet<PhoneNumber>> deleteAllNumbersOfUser
            (TreeMap<User, TreeSet<PhoneNumber>> map, String name, String surName){
        Reader r = new Reader();
        if(map.isEmpty()){
            r.reply("You have not added any user yet!!");
        }else {
            Set<Map.Entry<User, TreeSet<PhoneNumber>>> entries = map.entrySet();
            Iterator<Map.Entry<User, TreeSet<PhoneNumber>>> iterator = entries.iterator();
            while (iterator.hasNext()) {
                Map.Entry<User, TreeSet<PhoneNumber>> next = iterator.next();
                if (next.getKey().getName().equals(name) || next.getKey().getSurname().equals(surName)) {
                    if (next.getValue().isEmpty()) {

                        r.reply("This user has no numbers yet! ");
                    } else {
                        next.getValue().removeAll(next.getValue());
                    }
                }
//                else {
//                    r.reply("No such user- " + name + " " + surName);
//                    break;
//                }
            }
        }

        return map;
    }

    public static TreeMap<User, TreeSet<PhoneNumber>> deletePhoneNumber
            (TreeMap<User, TreeSet<PhoneNumber>> map, String name, String surName, String typeOfNumber){
        Reader r = new Reader();
        if(map.isEmpty()){
            r.reply("You have not added any user yet!");
        }else {
            Set<Map.Entry<User, TreeSet<PhoneNumber>>> entries = map.entrySet();

            Iterator<Map.Entry<User, TreeSet<PhoneNumber>>> iterator = entries.iterator();

            while (iterator.hasNext()) {
                Map.Entry<User, TreeSet<PhoneNumber>> next = iterator.next();
                Iterator<PhoneNumber> iterator1 = next.getValue().iterator();
                if (next.getKey().getName().equals(name) || next.getKey().getSurname().equals(surName)) {
                    if (next.getValue().isEmpty()) {
                        r.reply("This user has no numbers yet! ");
                    } else {
                        while (iterator1.hasNext()) {
                            PhoneNumber next1 = iterator1.next();
                            if (next1.getTypeOfNumber().equals(typeOfNumber)) {
                                iterator1.remove();
                            }
//                            else {
//                                r.reply("No such number- " +typeOfNumber);
//                                break;
//                            }
                        }
                    }
                }
//                else {
//                    r.reply("No such user- " + name + " " + surName);
//                }
            }
        }
        return map;
    }
    public static TreeMap<User, TreeSet<PhoneNumber>> changePhoneNumber
            (TreeMap<User, TreeSet<PhoneNumber>> map, String name, String surName, String typeOfNumber, int number){
        Reader r = new Reader();
        if(map.isEmpty()){
            r.reply("You have not added any user yet!");
        }else {
            Set<Map.Entry<User, TreeSet<PhoneNumber>>> entries = map.entrySet();

            Iterator<Map.Entry<User, TreeSet<PhoneNumber>>> iterator = entries.iterator();

            while (iterator.hasNext()) {
                Map.Entry<User, TreeSet<PhoneNumber>> next = iterator.next();
                Iterator<PhoneNumber> iterator1 = next.getValue().iterator();
                if (next.getKey().getName().equals(name) || next.getKey().getSurname().equals(surName)) {
                    if (next.getValue().isEmpty()) {
                        r.reply("This user has no numbers yet! ");
                    } else {
                        while (iterator1.hasNext()) {
                            PhoneNumber next1 = iterator1.next();
                            if (next1.getTypeOfNumber().equals(typeOfNumber)) {
                                next1.setNumber(number);
                            }
                            else {
                                r.reply("No such number- " +typeOfNumber);
                                break;
                            }
                        }
                    }
                }
//                else {
//                    r.reply("No such user- " + name + " " + surName);
//                    break;
//                }
            }
        }
        return map;
    }

    public static TreeMap<User, TreeSet<PhoneNumber>> menu(TreeMap<User, TreeSet<PhoneNumber>> map){

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
                menu(map);
            }

            switch (response) {
                case 1:{
                    r.getUser();
                    String name = r.name;
                    String surname = r.surName;
                    if (name==null||surname==null){
                        menu(map);
                    }else {
                        map = addUser(map, name, surname);
                        menu(map);
                    } break;
                }
                case 2:{
                    r.setNumber();
                    String name = r.name2;
                    String surname = r.surName2;
                    String typeOfNumber = r.typeOfNumber2;

                    if (name==null||surname==null||typeOfNumber==null||r.number==null){
                        menu(map);
                    }else {int number=0;
                        try {
                            number = Integer.parseInt(r.number);
                        }catch (NumberFormatException e){
                            r.reply("Type numbers only!!");
                            menu(map);
                            break;
                        }
                        map = addPhoneNumber(map, name, surname, typeOfNumber, number);
                        menu(map);
                    } break;

                }
                case 3:{
                    r.getUser();
                    String name = r.name;
                    String surname = r.surName;
                    if (name==null||surname==null){
                        menu(map);
                    }else {
                        map = deleteUser(map, name, surname);
                        menu(map);
                    }break;
                }
                case 4:{
                    r.getUser();
                    String name = r.name;
                    String surname = r.surName;

                    if (name==null||surname==null){
                        menu(map);
                    }
                    else {
                        map = deleteAllNumbersOfUser(map, name, surname);
                        menu(map);
                    }break;
                }
                case 5:{
                    r.getNumber();
                    String name = r.name1;
                    String surname = r.surName1;
                    String typeOfNumber = r.typeOfNumber1;
                    if (name==null||surname==null||typeOfNumber==null){
                        menu(map);
                    }else {
                        map = deletePhoneNumber(map, name, surname, typeOfNumber);
                        menu(map);
                    }break;
                }
                case 6:{
                    r.changeNumber();
                    String name = r.name3;
                    String surname = r.surName3;
                    String typeOfNumber = r.typeOfNumber3;
                    if (name==null||surname==null||typeOfNumber==null||r.number3==null){
                        menu(map);
                    }else {int number=0;
                        try {
                            number = Integer.parseInt(r.number3);
                        }catch (NumberFormatException e){
                            r.reply("Type numbers only!!");
                            menu(map);
                            break;
                        }
                        map = changePhoneNumber(map, name, surname, typeOfNumber, number);
                        menu(map);
                    } break;
                }
                case 7:{
                    printPhoneBook(map);
                    menu(map);
                    break;
                }
                case 8:{
                    r.getUser();
                    String name = r.name;
                    String surname = r.surName;
                    if (name==null||surname==null){
                        menu(map);
                    }else {
                        printPhoneBookOfUser(map, name, surname);
                        menu(map);
                    } break;
                }
                case 9:{
                    System.exit(0);
                }

            }

        }

        return map;
    }

    public static void main(String[] args) {
        TreeMap<User, TreeSet<PhoneNumber>> treeMap = new TreeMap<>();
        menu(treeMap);

    }
}
