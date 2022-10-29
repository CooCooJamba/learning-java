import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите информацию для записи в файл:");
        String str = sc.nextLine();
        Files.write(Paths.get("E://Java/projects/LW_8/ABC.txt"), str.getBytes(), StandardOpenOption.APPEND);
    }
}
