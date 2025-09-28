import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
    System.out.println("Você é emancipado?");
    var isEmancipado = scanner.nextBoolean();
        var canNotDrive = age >= 18 || (isEmancipado && age >= 16);
        System.out.printf("Você pode dirigiir? (%s)", canNotDrive);
    }
}