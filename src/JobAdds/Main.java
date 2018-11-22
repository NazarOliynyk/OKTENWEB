package JobAdds;



import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    static TreeSet<User> users = new TreeSet<>();
    static TreeSet<Location> locations = new TreeSet<>();
    static TreeSet<Post> posts = new TreeSet<>();

    public static TreeSet<User> addUser(TreeSet<User> users){

        Reader r = new Reader();

        r.createUser();
        String name = r.name1;
        int phoneNumber =0;
        try {
            phoneNumber = Integer.parseInt(r.phoneNumber);
        }catch (Exception e){
            r.reply("Type numbers only!!");
            menu(posts);
        }
        String email = r.email;
        User user = new User();
        user.setName(name);
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        users.add(user);

        return users;
    }

    public static TreeSet<Location> addLocation(TreeSet<Location> locations){

        Reader r = new Reader();
        r.createLocation();
        String country = r.country1;
        String city = r.city1;
        Location location = new Location();

        location.setCountry(country);
        location.setCity(city);
        locations.add(location);

        return locations;
    }

    public static TreeSet<Post> placeAd (TreeSet<Post> posts){

        Reader r = new Reader();
        r.placeAd();
        String name = r.name2;
        int typeOfAd= 0;
        try {
            typeOfAd = Integer.parseInt(r.typeOfAd2);
        }catch (Exception e){
            r.reply("Type numbers only!!");
            menu(posts);
        }
        String title = r.title2;
        String description = r.description2;
        String country = r.country2;
        String city = r.city2;

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
            menu(posts);
        }

        if(typeOfAd==1){
            post = new OfferJob();
        }
        else if (typeOfAd == 2){
            post = new LookForJob();
        }else {
            r.reply("Wrong input, typeOfAd must be either 1 or 2 !!");
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

        return posts;
    }

    public static TreeSet<Post> deleteAd(TreeSet<Post> posts){

        Reader r =  new Reader();
        r.deleteAd();
        String name = r.name3;
        String title = r.title3;
        User user= null;
        Post post = null;
        if (posts.isEmpty()){
            System.out.println("There are no posts yet at all!");
            menu(posts);
        }else {
            for (User user1 : users) {
                if (user1.getName().equals(name)){
                    user = user1;
                }
            }
            if (user == null){
                r.reply("No such user: "+name+" ! Sign in into users' list");
                menu(posts);
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
        return posts;
    }

    public static void selectAll(TreeSet<Post> posts){
        Reader r = new Reader();
        String reply = "There are following posts: \n";
        if(posts.isEmpty()){
            r.reply("There are no posts yet!");

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
        try {
            typeOfAd = Integer.parseInt(r.typeOfAd3);
        }catch (Exception e){
            r.reply("Type numbers only!!");
            menu(posts);
        }
        String reply = null;

        if(posts.isEmpty()){
            r.reply("There are no posts yet!");
            menu(posts);
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
        try {
            typeOfAd = Integer.parseInt(r.typeOfAd4);
        }catch (Exception e){
            r.reply("Type numbers only!!");
            menu(posts);
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
        Reader r = new Reader();
        r.menu();
        if(r.response==null){
            System.exit(0);
        }
        else {
            int response = 0;
            try {
                response = Integer.parseInt(r.response);
            } catch (NumberFormatException e) {
                r.reply("Type numbers only!!");
                menu(posts);
            }
            switch (response) {
                case 1:{
                    users = addUser(users);
                    menu(posts);
                    break;
                }
                case 2:{
                    locations = addLocation(locations);
                    menu(posts);
                    break;
                }
                case 3:{
                    posts = placeAd(posts);
                    menu(posts);
                    break;
                }
                case 4:{
                    posts = deleteAd(posts);
                    menu(posts);
                    break;
                }
                case 5:{
                    selectAll(posts);
                    menu(posts);
                    break;
                }
                case 6:{
                    selectByType(posts);
                    menu(posts);
                    break;
                }
                case 7:{
                    selectByTypeAndLocation(posts);
                    menu(posts);
                    break;
                }
                case 8:{
                    System.exit(0);
                }
            }
        }

        return posts;
    }

    public static void main(String[] args) {

        posts = menu(posts);


    }
}

