package JobAdds;


public class OfferJob extends Post {

    @Override
    public String toString() {
        return "OfferJob{} " + super.toString();
    }

    @Override
    public int compareTo(Post o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}
