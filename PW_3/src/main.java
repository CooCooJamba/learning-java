import java.lang.*;
public class main {
    public static void main(String[] args) {
        Circle rec = new Circle(6, "green", true);
        System.out.println(rec.getArea());
        System.out.println(rec.toStr());
        System.out.println(rec.getPerimeter());
        System.out.println(rec.getRadius());
    }
}
