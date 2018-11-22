package Agregation_Composition;

class User{

    void addition(int a, int b){
        System.out.println(new Calculator().plus(a, b));
    }
}

class Calculator{
    int plus(int i, int y){
        return i+y;
    }
}
public class Delegant {

    public static void main(String[] args) {

    }
}
