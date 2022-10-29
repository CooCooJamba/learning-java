import org.w3c.dom.ls.LSOutput;

public class main {
    public static void main(String[] args) {
        //Задание 1
        Person person_1 = new Person("Иванов");
        Person person_2 = new Person("Иван", "Иванов");
        Person person_3 = new Person("Иван", "Иванов", "Иванович");
        System.out.println(person_1.create());
        System.out.println(person_2.create());
        System.out.println(person_3.create());
        //Задание 4
        PhoneNumber.create("+79186835902");
        PhoneNumber.create("89186835902");
    }
}
