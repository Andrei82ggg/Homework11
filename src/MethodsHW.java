import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class MethodsHW {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Выберите метод: \n1. Высокосный год \n2. Проверка устройства \n3. Количество дней");
            var type = scanner.nextInt();

            switch (type) {
                case 1:
                    System.out.print("Введите год: ");
                    var year = scanner.nextInt();
                    checkYearOnLeap(year);
                    break;
                case 2:
                    System.out.print("Ведите тип ОС: ");
                    var osType = scanner.nextInt();
                    System.out.println("Введите год ОС: ");
                    var osYaer = scanner.nextInt();
                    printDevice(osType, osYaer);
                    break;
                case 3: {
                    System.out.println("Введите дистанцию: ");
                    var days = calculateDays(scanner.nextInt());
                    if (days == -1) {
                        System.out.println("Доставки нет ");
                    } else {
                        System.out.println("Потребуется дней: " + days);
                    }
                }
            }
        }
    }

    private static void checkYearOnLeap(int year) {
        if (year % 4 == 0 && (year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "год является высокосным");
        } else {
            System.out.println(year + "год не является высокосным");
        }

    }

    public static void printDevice(int clientOS, int clientYear) {
        int year = LocalDate.now().getYear();
        if (year < clientYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (year < clientYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (year >= clientYear && clientOS == 0) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    private static int calculateDays(int distance) {
        if (distance > 100) {
            System.out.println("Доставки нет!");
            return -1;

        }
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60 && distance <= 100) {
            days++;
        }
        return (days);
    }
}


