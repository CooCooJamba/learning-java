public class Square extends Rectangle {
    protected double side;
    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double length) {
        this.side = side;
    }

    @Override
    public String toStr() {
        return side + ", " + color + ", " + filled;
    }
}