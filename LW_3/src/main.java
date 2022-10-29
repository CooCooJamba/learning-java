public class main {
    public static void main(String[] args) {
        Beagle beagle = new Beagle("Beagle", "Black", "Bob", 25, true);
        System.out.println("Общая информация: " + beagle.toString());
        System.out.println("Порода собаки: " + beagle.getBreed());
        System.out.println("Цвет шерсти собаки: " + beagle.getColor());
        System.out.println("Имя собаки: " + beagle.getName());
        System.out.println("Вес собаки: " + beagle.getWeight());
        System.out.println("Состояние здоровья собаки: " + beagle.isHealth());
        beagle.setHealth(false);
        System.out.println("Состояние здоровья собаки: " + beagle.isHealth());
    }
}