package HW004Composition;

/**
 * Created by user on 19.11.18.
 */
public class Pet implements Comparable<Pet>{

    private String nickname;
    private double age;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (Double.compare(pet.age, age) != 0) return false;
        return nickname != null ? nickname.equals(pet.nickname) : pet.nickname == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nickname != null ? nickname.hashCode() : 0;
        temp = Double.doubleToLongBits(age);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Pet o) {
        return this.getNickname().compareTo(o.getNickname());
    }

    public void voice(String sound){
        System.out.println("The voice is "+sound);
    }
}
