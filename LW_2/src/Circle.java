public class Circle {
    private double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double length() {
        return 2 * pi * radius;
    }

    public double area() {
        return pi * radius * radius;
    }
}
