package HW002;

/**
 * Created by user on 07.11.18.
 */
public class Priamokutnyk implements Square {

    private double width;
    private  double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double square(){
        this.width=width;
        this.height=height;
        return width*height;
    }

    public static void main(String[] args) {
        Priamokutnyk priamokutnyk = new Priamokutnyk();
        priamokutnyk.setWidth(22.33);
        priamokutnyk.setHeight(33.22);

        double square = priamokutnyk.square();

        System.out.println("The square= "+square);
    }
}
