import java.io.IOException;

public class main {
    public static void main(String[] args) {
        Client cl1 = new Client("Иванов Иван Иванович", 1234567891);
        int enteredINN = 1234567890;
        try {
            if (enteredINN != cl1.getINN()) {
                throw new IOException();
            }
        } catch (Exception e) {
            System.out.println("Данный ИНН является недействительным");
        }
    }
}
