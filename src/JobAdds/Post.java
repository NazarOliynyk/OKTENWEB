package JobAdds;


public class Post implements Comparable<Post> {

    private String title;
    private String description;

    User user;
    Location location;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public int compareTo(Post o) {
        return this.getTitle().compareTo(o.getTitle());
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", location=" + location +
                '}';
    }
}
