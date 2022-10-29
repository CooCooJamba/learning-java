import java.lang.*;
public class main {
    public static void main(String[] args) {
        Author a = new Author("Ivan","ivan@gmail.com", 'M');
        a.getEmail();
        System.out.println(a.toStr());
    }
}
