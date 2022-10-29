public class Client {
    private String str;
    private int INN;

    public Client(String str, int INN) {
        this.str = str;
        this.INN = INN;
    }

    public String getStr() {
        return str;
    }

    public int getINN() {
        return INN;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setINN(int INN) {
        this.INN = INN;
    }
}
