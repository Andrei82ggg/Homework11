import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class MethodsHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Выберите метод: \n1. Высокосный год \n2. Проверка устройства");
            var type = scanner.nextInt();

            switch (type) {
                case 1:
                    System.out.print("Введите год: ");
                    var year = scanner.nextInt();
                    isLeapYear(year);
                    break;
                case 2:
                    System.out.print("Ведите тип ОС: ");
                    var osType = scanner.nextInt();
                    printDevice(osType);
                    break;
            }
        }
    }

    private static void isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "год является высокосным");
        } else {
            System.out.println(year + "год не является высокосным");
        }

    }
    private static void printDevice(int clientOS){
        int year = LocalDate.now().getYear();
        if (year<2015 && clientOS==0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (year<2015 && clientOS==1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if (year>=2015&&clientOS==0){
            System.out.println("Установите  версию приложения для iOS по ссылке");
        }else{
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        }

    }


