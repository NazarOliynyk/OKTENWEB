package HW002;

/**
 * Created by user on 07.11.18.
 */

class Aaa implements Scream{

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void scream(){
        System.out.println(message);
    }
}
class Bbb implements Scream{

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void scream(){
        System.out.println(message);
    }
}

public class Sound {
   public static void sound(Scream scream){
        scream.scream();
    }
    public static void main(String[] args) {
        Aaa a = new Aaa();
        Bbb b = new Bbb();
        a.setMessage("aaaaaaaaaaaaaaa!!");
        b.setMessage("bbbbbbbbbbbbbbb!!");
        sound(a);
        sound(b);
    }
}
