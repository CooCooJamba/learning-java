public class Ball {
    private String color;
    private String name;
    public Ball() {

    }
    public Ball(String color, String name) {
        this.color = color;
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
};