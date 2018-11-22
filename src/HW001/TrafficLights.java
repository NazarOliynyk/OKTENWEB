package HW001;


import javax.swing.*;
/**
 * Created by user on 02.11.18.
 */
class Reader {

    String light, isRoadClear;
    // int isClear;
    void insert(){
        light = JOptionPane.showInputDialog("What light is on: type red, yellow or green");
        isRoadClear = JOptionPane.showInputDialog("Is road clear: type yes or not");
        // isClear = JOptionPane.showConfirmDialog (null, "Is road clear");
    }

    void reply(String reply){
        JOptionPane.showMessageDialog(null, reply);
        // null puts your text in the middle of the table
    }
}


public class TrafficLights {

    public static void main(String[] args){
        Reader r = new Reader ();
        r.insert ();
        String light = r.light;
        String isRoadClear = r.isRoadClear;

        if(light.equals ("green")&&isRoadClear.equals ("yes")){
            r.reply ("GO!");
            //break;
        }
        else if (light.equals ("green")&&isRoadClear.equals ("not")){
            r.reply ("Wait until offenders drive away");
        }
        else if (light.equals ("yellow")&&isRoadClear.equals ("not")){
            r.reply ("Wait!");
        }
        else if (light.equals ("yellow")&&isRoadClear.equals ("yes")){
            r.reply ("Wait anyway!");
        }
        else if (light.equals ("red")&&isRoadClear.equals ("yes")){
            r.reply ("Wait anyway!");
        }
        else if (light.equals ("red")&&isRoadClear.equals ("not")){
            r.reply ("Stay put and wait!");
        }
        else {
            r.reply ("Wrong input");
        }

        //System.out.println ("r.isClear" +r.isClear);

    }
}


