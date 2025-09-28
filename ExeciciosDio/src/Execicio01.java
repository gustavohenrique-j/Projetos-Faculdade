import java.time.OffsetDateTime;
import java.util.Scanner;

public class Execicio01 {
    public static void main(String[] args) {
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome");
        var name = scanner.nextInt();
        System.out.println("Informe sua data de nascimento");
        var year = scanner.nextInt();
        var age = baseYear - year;
        System.out.printf("Olá %s você tem %s \n", name, age);
    }
}