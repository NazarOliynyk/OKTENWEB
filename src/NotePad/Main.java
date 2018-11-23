package NotePad;

import JobAdds.Location;
import sun.invoke.empty.Empty;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {


    static TreeSet<User> users = new TreeSet<>();
    static CountTypes countTypes = new CountTypes();

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

    public static TreeSet<User> signIn(TreeSet<User> users, String login, String password) {
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        users.add(user);

        return users;
    }

    public static User authorization(TreeSet<User> users, String login, String password) {
        User user = null;
        boolean flag = false;
        for (User u : users) {
            if (u.getLogin().equals(login) && u.getPassword().equals(password)) {
                user = u;
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No such user " + login + " sign in!");
            return null;
        }
        return user;
    }

    public static TreeSet<User> addNote
            (User user, String name, String text, String date, String place, String contact, Type type) {

        ArrayList<Note> notes;

        if (user == null) {
            System.out.println("Log in!");
            return users;
        } else if (user.getNotes() == null) {
            notes = new ArrayList<>();
        } else {
            notes = user.getNotes();
        }

        Note note = Note.builder().name(name).text(text).date(date).place(place).contact(contact).type(type).build();
        notes.add(note);
        user.setNotes(notes);
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
                reply += note.toString()+"("+quantityOfTypes(note.getType(), countTypes.countTypes(user))+ ") \n";
            }

        }


        System.out.println(reply);
    }

    public static void printNotesByType(User user, Type type) {

        String reply = "There are following notes of the user " + user.getLogin() + "and event- "+type+": \n";
        boolean flag = false;
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
                    //reply += note.toString() + "(" + quantityOfTypes(note.getType(), countTypes.countTypes(user)) + ") \n";
                    flag = true;
                }
            }
        }

//        if (!flag) {
//            reply += "No notes of type: " + type;
//            System.out.println(reply);
//            //return;
//        }

        System.out.println(reply);

    }


    static class CountTypes implements Counter{

        @Override
        public int[] countTypes(User user) {

            int event = 0;
            int meeteing = 0;
            int note = 0;
            int birthday = 0;
            String reply = "The quantity of each type of events is: \n";

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
        public static void main(String[] args) {


            TreeSet<User> users = new TreeSet<>();
            users = signIn(users, "nazar", "1233");

            System.out.println(users);

            // users = addNote(users, "nazar", "1233", "meet Galia", "take an umbrella", "10.11.2018", "Lviv", "Galia", Type.MEETING);

            System.out.println(users);

            //users = addNote(users, "naza", "1233", "meet Galia", "take an umbrella", "10.11.2018", "Lviv", "Galia", Type.MEETING);

            User user1 = authorization(users, "naza", "1233");

            System.out.println(user1);

            User user = authorization(users, "nazar", "1233");

            users = addNote(user, "meet Galia", "take an umbrella", "10.11.2018", null, "Galia", Type.MEETING);

            System.out.println("users after addition" + users);

            User user2 = null;

            users = addNote(user2, "meet Galia", "take an umbrella", "10.11.2018", "null", "Galia", Type.MEETING);

            System.out.println("users after addition 2" + users);

            printAllNotes(user);

            printNotesByType(user, Type.EVENT);

            users = addNote(user, "meet Roma", "take a bag", "15.11.2018", "Lviv", null, Type.MEETING);
            printAllNotes(user);

            printNotesByType(user, Type.MEETING);
            //  CountTypes countTypes = new CountTypes();
            // System.out.println(countTypes.countPosts(user));
        }
    }

//
//static class CountTypes implements Counter{
//
//    @Override
//    public String countPosts(User user) {
//
//        int event = 0;
//        int meeteing = 0;
//        int note = 0;
//        int birthday = 0;
//        String reply = "The quantity of each type of events is: \n";
//
//        for (Note n: user.getNotes()) {
//            switch (n.getType()){
//                case EVENT:{
//                    event++;
//                    break;
//                }
//                case MEETING:{
//                    meeteing++;
//                    break;
//                }
//                case NOTE:{
//                    note++;
//                    break;
//                }
//                case BIRTHDAY:{
//                    birthday++;
//                    break;
//                }
//            }
//        }
//        return reply+= "EVENT - "+event+" \n"+
//                "MEETING - "+meeteing+" \n"+
//                "NOTE - "+note+" \n"+
//                "BIRTHDAY - "+birthday+" \n";
//    }
//}