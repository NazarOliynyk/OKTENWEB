package Topics;

/**
 * Created by user on 02.11.18.
 */

class UserGS{
    private int id;
    private String name;

    public UserGS(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserGS() {}

    @Override
    public String toString() {
        return "UserGS{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId(String pin) {
        if(pin=="1111"){
            return id;}
        else {return -999;}
    }

    public String getName(String pin) {
        if(pin =="1111"){
            return name;}
        else {return "wrong pin";}
    }

    public void setName(String pin, String name) {
        if(pin =="1111"){
            this.name = name;}
        else {
            System.out.println (" wrong pin");} // checking access to user1
    }

    public void setId(int id) {
        if(id<=0){
            System.out.println ("wrong input: id <=0");
        }
        else {
            this.id = id;} // or to avoid wrong input data
    }
}
public class GetterSettersPrivate {

    public static void main(String[] args) {

        UserGS user1 = new UserGS (100, "kolia");

        // System.out.printf (user1.id, user1.name); // does not work at all
        System.out.println(user1.getName ("1111"));
        System.out.println(user1.getName ("nhsldvnl"));
        user1.setName ("dcnbjncd", "baksb");
        user1.setId (-6);
    }
}

