package NotePad;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {


    TreeSet<User> users = new TreeSet<>();

    public static TreeSet<User> signIn(TreeSet<User> users, String login, String password){
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        users.add(user);

        return users;
    }

    public static TreeSet<User> addNote
            (TreeSet<User> users, String login, String password,
             String name, String text, String date, String place, String contact, Type type){

        User user = null;
        Note note = new Note();
        ArrayList<Note> notes= new ArrayList<>();

        for (User u : users) {
            if(u.getLogin().equals(login)&&u.getPassword().equals(password)){
                user=u;
            }

        }
        if(user==null){
            System.out.println("No such user "+login+" sign in!");
            System.exit(0);
        }else {

            // Person person = Person.builder().name("Ivan").surname("Petrenko").mail("emaill").build();
            note = Note.builder().name(name).text(text).date(date).place(place).contact(contact).type(type).build();
            notes.add(note);
            user.setNotes(notes);

        }

        return users;
    }

    public static void printAllNotes
            (TreeSet<User> users, String login){


    }


    public static void main(String[] args) {


        TreeSet<User> users = new TreeSet<>();
        users= signIn(users, "nazar", "1233");

        System.out.println(users);
    }
}

