public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(100);
        System.out.println("Радиус окружности: " + circle.getRadius());
        System.out.println("Площадь окружности: " + circle.area());
        System.out.println("Длина окружности: " + circle.length());
    }
}
