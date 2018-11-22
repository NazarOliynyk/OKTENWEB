package Lambdas;

public class Main_1 {

    public static void main(String[] args) {

        Inter_1 inter_1_1 = new Inter_1() {
            @Override
            public void some() {
                System.out.println("Hello!");
            }
        };

//        Inter_1 inter_1_2=()-> System.out.println("Hello!");
//        Inter_1 inter_1_3= ()->{
//            System.out.println("Hello");
//            System.out.println("!!!!");
//        };

//        inter_1_1.some();
//        inter_1_2.some();
//        inter_1_3.some();
    }
}
