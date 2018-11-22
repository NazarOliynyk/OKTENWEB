package HW002;

/**
 * Created by user on 07.11.18.
 */
public class Kvadrat implements Square {

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
        Kvadrat kvadrat = new Kvadrat();
        kvadrat.setWidth(22.33);
        kvadrat.setHeight(22.33);

        double square = kvadrat.square();

        System.out.println("The square= "+square);
    }
}
