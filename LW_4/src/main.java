public class main {
    public static void main(String[] args) {
        Shop shop = new Shop(20);
        System.out.println("Цена продукта в магазине: " + shop.getPrice());
        Bank bank = new Bank(15);
        System.out.println("Цена кредита в банке: " + bank.getPrice());
    }
}
