import java.util.Scanner;

public class MethodsHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        var year = scanner.nextInt();
        isLeapYaer(year);
    }
    private static void isLeapYaer(int year) {
        if (year % 4 == 0 && (year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "год является высокосным");
        } else {
            System.out.println(year + "год не является высокосным");
        }

    }

}
