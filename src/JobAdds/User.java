package JobAdds;


public class User implements Comparable<User>{

    private String Name;
    private int phoneNumber;
    private String email;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (phoneNumber != user.phoneNumber) return false;
        if (Name != null ? !Name.equals(user.Name) : user.Name != null) return false;
        return email != null ? email.equals(user.email) : user.email == null;
    }

    @Override
    public int hashCode() {
        int result = Name != null ? Name.hashCode() : 0;
        result = 31 * result + phoneNumber;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.getName().compareTo(o.getName());
    }
}
