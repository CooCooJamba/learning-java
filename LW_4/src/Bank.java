public class Bank implements Priceable {
    private int credit;

    public Bank(int credit) {
        this.credit = credit;
    }

    public int getPrice() {
        return credit;
    }
}
