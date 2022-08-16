import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");

        // Task 2
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип ОС, где 0 - IOS, а 1 - Android: ");
        int clientOs = scanner.nextInt();
        System.out.println("Укажите год выпуска вашего телефона: ");
        int clientDeviceYear = scanner.nextInt();
        if (clientOs == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите текущую версию приложения для iOS по ссылке");
            } else
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите текущую версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //Task 3
        System.out.println();

        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year +" год не является високосным");

        //Task 4
        System.out.println();

        System.out.println("Введите расстояние до адреса");
        int deliveryDistance = scanner.nextInt();
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance >60) {
            deliveryDays++;}
        System.out.println("Потребуется дней: " + deliveryDays);

        //Task 5
        System.out.println();

        System.out.println("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Input error");
        }
    }
}

