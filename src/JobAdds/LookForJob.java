package JobAdds;


public class LookForJob extends Post {


    @Override
    public String toString() {
        return "LookForJob{} " + super.toString();
    }

    @Override
    public int compareTo(Post o) {
        return this.getTitle().compareTo(o.getTitle());
    }


}

