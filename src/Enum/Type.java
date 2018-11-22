package Enum;

/**
 * Created by user on 21.11.18.
 */

public enum Type {


    SEDAN(5), PICKUP(3);

    int seats;
    Type(int seats) {
        this.seats= seats;
    }
}
