package JobAdds;



import java.util.Iterator;
import java.util.TreeSet;

public class Main_1 {

    static TreeSet<User> users = new TreeSet<>();
    static TreeSet<Location> locations = new TreeSet<>();
    static TreeSet<Post> posts = new TreeSet<>();


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

    public static void addUser(TreeSet<User> users){

        Reader r = new Reader();

        r.createUser();
        String name = r.name1;
        int phoneNumber=0;
        if (r.name1 == null||r.phoneNumber==null) {
            return;
        }
        if (isNumber(r.phoneNumber)) {
            phoneNumber = Integer.parseInt(r.phoneNumber);
        }
        String email = r.email;
        User user = new User();
        user.setName(name);
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        users.add(user);


    }

    public static void addLocation(TreeSet<Location> locations){

        Reader r = new Reader();
        r.createLocation();
        String country = r.country1;
        String city = r.city1;
        if (r.country1 == null||r.city1==null) {
            return;
        }
        Location location = new Location();

        location.setCountry(country);
        location.setCity(city);
        locations.add(location);

    }

    public static void placeAd (TreeSet<Post> posts){

        Reader r = new Reader();
        r.placeAd();
        String name = r.name2;
        int typeOfAd= 0;

        if (isNumber(r.typeOfAd2)) {

            typeOfAd = Integer.parseInt(r.typeOfAd2);
        }
        String title = r.title2;
        String description = r.description2;
        String country = r.country2;
        String city = r.city2;
        if (r.name2 == null||r.typeOfAd2==null||r.title2==null||r.country2==null||r.city2==null) {
            return;
        }

        Post post = new Post();
        Location location =null;
        User user= null;

        for (User user1 : users) {
            if (user1.getName().equals(name)){
                user = user1;
            }
        }
        if (user == null){
            r.reply("No such user: "+name+" ! Sign in into users' list");



        }

        if(typeOfAd==1){
            post = new OfferJob();
        }
        else if (typeOfAd == 2){
            post = new LookForJob();
        }else {
            r.reply("Wrong input, typeOfAd must be either 1 or 2 !!");
            return;
        }

        for (Location location1 : locations) {
            if(location1.getCity().equals(city)&&location1.getCountry().equals(country)){
                location = location1;

            }
        }
        if (location == null){
            r.reply("No such location: "+city+" in "+country+ "! Add it into the list of locations");
            menu(posts);
        }

        post.setTitle(title);
        post.setDescription(description);
        post.setUser(user);
        post.setLocation(location);

        posts.add(post);


    }

    public static void deleteAd(TreeSet<Post> posts){

        Reader r =  new Reader();
        r.deleteAd();
        String name = r.name3;
        String title = r.title3;
        User user= null;
        Post post = null;
        if (posts.isEmpty()){
            r.reply("There are no posts yet at all!");

            return;
        }else {
            for (User user1 : users) {
                if (user1.getName().equals(name)){
                    user = user1;
                }
            }
            if (user == null){
                r.reply("No such user: "+name+" ! Sign in into users' list");
                return;
            }
            Iterator<Post> iterator = posts.iterator();
            while (iterator.hasNext()){
                Post next = iterator.next();
                if(next.getTitle().equals(title)&&next.getUser().getName().equals(name)){
                    post=next;
                    iterator.remove();
                }
            }
            if(post==null){
                r.reply("No such post "+title+" in user "+name+" account!");
                menu(posts);
            }
        }

    }

    public static void selectAll(TreeSet<Post> posts){
        Reader r = new Reader();
        String reply = "There are following posts: \n";
        if(posts.isEmpty()){
            r.reply("There are no posts yet!");
                return;
        }else {
            for (Post post : posts) {
                reply+=post+"\n";
            }
            r.reply(reply);
        }
    }

    public static void selectByType(TreeSet<Post> posts){

        Reader r = new Reader();
        r.selectByType();

        int typeOfAd= 0;

        if (!isNumber(r.typeOfAd3)) {
            return;
        } else {
            typeOfAd = Integer.parseInt(r.typeOfAd3);
        }

        String reply = null;

        if(posts.isEmpty()){
            r.reply("There are no posts yet!");
            return;
        }else {
            Post post = new Post();

            if (typeOfAd == 1) {
                post = new OfferJob();
                reply = "There are following ads of looking for a worker: \n ";
            } else if (typeOfAd == 2) {
                reply = "There are following ads of looking for a job: \n ";
                post = new LookForJob();
            } else {
                r.reply("Wrong input, typeOfAd must be either 1 or 2 !!");
            }

            for (Post post1 : posts) {
                if (post1.getClass().getName().equals(post.getClass().getName())) {
                    reply += post1.toString() + "\n";
                }
            }r.reply(reply);
        }

    }

    public static void selectByTypeAndLocation(TreeSet<Post> posts){

        Reader r = new Reader();
        r.selectByTypeAndLocation();

        int typeOfAd= 0;

        if (!isNumber(r.typeOfAd4)) {
            return;
        } else {
            typeOfAd = Integer.parseInt(r.typeOfAd4);
        }

        String city = r.city4;
        String reply = null;
        if(posts.isEmpty()){
            r.reply("There are no posts yet!");
            menu(posts);
        }else {
            Post post = new Post();

            if (typeOfAd == 1) {
                post = new OfferJob();
                reply = "There are following ads of looking for a worker in "+city+": \n ";
            } else if (typeOfAd == 2) {
                reply = "There are following ads of looking for a job in "+city+": \n ";
                post = new LookForJob();
            } else {
                r.reply("Wrong input, typeOfAd must be either 1 or 2 !!");
                menu(posts);
            }

            for (Post post1 : posts) {
                if (post1.getClass().getName().equals(post.getClass().getName())&&post1.getLocation().getCity().equals(city)) {
                    reply += post1.toString() + "\n";
                }
            }r.reply(reply);
        }
    }

    public static TreeSet<Post> menu(TreeSet<Post> posts){
        int response =0;
        while (!(response == 8))  {
            Reader r = new Reader();
            r.menu();
            if (r.response == null) {
               break;
            }
            if (isNumber(r.response)) {

                    response = Integer.parseInt(r.response );
            }
                switch (response) {
                    case 1:
                        addUser(users);

                        break;

                    case 2:
                        addLocation(locations);

                        break;

                    case 3:
                        placeAd(posts);

                        break;

                    case 4:
                         deleteAd(posts);

                        break;
                    case 5:
                        selectAll(posts);

                        break;

                    case 6:
                        selectByType(posts);

                        break;

                    case 7:
                        selectByTypeAndLocation(posts);

                        break;

                    case 8:
                        break;

                    default:
                        break;

                }
            }

        return posts;
    }

    public static void main(String[] args) {

        posts = menu(posts);


    }
}

