package NestedClasses_Builder;

/**
 * Created by user on 21.11.18.
 */
public class User {
    public int age;
    public User(int age) {
        this.age = age;
    }
    class Car{
        public String model;
        public Car(String model) {
            this.model = model;
        }
        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    '}';
        }
    }
    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
