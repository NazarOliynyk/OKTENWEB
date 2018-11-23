package NotePad;

import java.util.ArrayList;
import java.util.TreeSet;

import static NotePad.Type.*;

public class Main_Base {

    static TreeSet<User> users = new TreeSet<>();

    static CountTypes countTypes = new CountTypes();

    static Reader r = new Reader();

    public static boolean isNumber( String s) throws NumberFormatException{
        Reader r =new Reader();
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            r.reply("Numbers only!");
            return false;
        }
    }

    static Type defineType(int typeNumber){
        Type type = null;

           switch (typeNumber){
               case 1: type=EVENT;
                   break;
               case 2: type=MEETING;
                   break;
               case 3: type=NOTE;
                   break;
               case 4: type=BIRTHDAY;
                   break;
               default:
                   r.reply("Set the number of a type within 1 and 4!");
                   break;
           }
        return type;
    }

    static int quantityOfTypes(Type type, int[] arr){
        int quantity =0;
        switch (type){
            case EVENT: quantity = arr[0];
                break;
            case MEETING: quantity = arr[1];
                break;
            case NOTE: quantity = arr[2];
                break;
            case BIRTHDAY: quantity = arr[3];
        }
        return quantity;
    }

    public static TreeSet<User> signIn(TreeSet<User> users) {
       r.authorization();
        String login = r.login;
        String password = r.password;
        if(login==null&&password==null){
            r.reply("Fill in both fields login and password");
            return users;
        }else {

            for (User user : users) {
                if (user.getLogin().equals(login)) {
                    r.reply("User " + login + " already exists. Choose another login!");
                    return users;
                }
            }
            ArrayList<Note> notes = new ArrayList<>();
            User user = new User();
            user.setLogin(login);
            user.setPassword(password);
            user.setNotes(notes);
            users.add(user);
        }
        System.out.println(users);
            return users;

    }

    public static User authorization(TreeSet<User> users) {
        User user = null;
        r.authorization();
        String login = r.login;
        String password = r.password;
        if(login==null&&password==null){
            r.reply("Fill in both fields login and password");
            return null;
        }
        else {
            boolean flag = false;
            for (User u : users) {
                if (u.getLogin().equals(login) && u.getPassword().equals(password)) {
                    user = u;
                    flag = true;
                }
            }
            if (!flag) {
                r.reply("Wrong input! Try again or sign in!");
                return null;
            }
        }
        return user;
    }

    public static boolean notesExist(User user){

        if(user.getNotes().isEmpty()){
            return false;
        }
        else {
            return true;}

    }

    public static TreeSet<User> addNote (User user) {

        r.addNote();
        String name = r.name;
        String text = r.text;
        String date = r.date;
        String place = r.place;
        String contact = r.contact;

        int type = 0;

        if (isNumber(r.type)) {
            type = Integer.parseInt(r.type);
        }

        Type type1 = defineType(type);

        Note note = Note.builder().name(name).text(text).date(date).place(place).contact(contact).type(type1).build();
        user.getNotes().add(note);

        users.add(user);
        return users;
    }

    public static void printAllNotes(User user) {

        String reply = "There are following notes of the user " + user.getLogin() + ": \n";

        if (users.isEmpty()) {
            System.out.println("No users logged yet!");
            return;
        } else if (user.getNotes().isEmpty()) {
            System.out.println("User " + user.getLogin() + " has not got any notes yet!");
        } else {
            for (Note note : user.getNotes()) {
                reply += note.toStringCount(quantityOfTypes(note.getType(), countTypes.countTypes(user))) + " \n";
            }

        }


        System.out.println(reply);
    }

    public static void printNotesByType(User user, Type type) {

        String reply = "There are following notes of the user " + user.getLogin() + "and event- "+type+": \n";

        if (users.isEmpty()) {
            System.out.println("No users logged yet!");
            return;
        } else {
            if (user.getNotes().isEmpty()) {
                System.out.println("User " + user.getLogin() + " has not got any notes yet!");
            } else {
                for (Note note : user.getNotes()) {
                    if (note.getType() == type)
                        reply += note.toStringCount(quantityOfTypes(note.getType(), countTypes.countTypes(user))) + " \n";

                }
            }
        }
        System.out.println(reply);
    }


    static class CountTypes implements Counter{

        @Override
        public int[] countTypes(User user) {

            int event = 0;
            int meeteing = 0;
            int note = 0;
            int birthday = 0;


            for (Note n: user.getNotes()) {
                switch (n.getType()){
                    case EVENT:{
                        event++;
                        break;
                    }
                    case MEETING:{
                        meeteing++;
                        break;
                    }
                    case NOTE:{
                        note++;
                        break;
                    }
                    case BIRTHDAY:{
                        birthday++;
                        break;
                    }
                }
            }
            int[] arr={event, meeteing, note, birthday };
            return arr;
        }
    }

    public static TreeSet<User> menu(TreeSet<User> users){
        int responseAuthorization =0;
        User user = new User();
        while (!(responseAuthorization == 4)) {

           // User user = new User();
            r.menuAuthorization();
            if (r.responseAuthorization == null) {
                break;
            }
            if (isNumber(r.responseAuthorization)) {
                responseAuthorization = Integer.parseInt(r.responseAuthorization);
            }
            else {
                r.reply("Try again");}
            switch (responseAuthorization) {
                case 1:
                    users = signIn(users);
                    break;
                case 2:
                    user = authorization(users);
                    break;
                case 3:{
                   // if(user.getNotes().isEmpty()){
                    r.subMenu1();
                        int responsesubMenu1 =0;
                        while (!(responsesubMenu1 == 4)) {

                            r.menuAuthorization();
                            if (r.responsesubMenu1 == null) {
                                break;
                            }
                            if (isNumber(r.responsesubMenu1)) {
                                responsesubMenu1 = Integer.parseInt(r.responsesubMenu1);
                            }
                            else {
                                r.reply("Try again");}
                            switch (responsesubMenu1) {
                                case 1:
                                    users = addNote(user);
                                    break;
                                case 4:
                                    break;
                                default:
                                    r.reply("Type numbers 1 or 4 only!");
                            }
                        }
                  //  }
                    break;
                }
                case 4:
                    break;
                default:
                    r.reply("Type numbers from 1 to 4 only!");
            }
        }
        return  users;
    }

    public static void main(String[] args) {

        users = menu(users);
    }
}
