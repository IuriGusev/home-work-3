public class Main {
    public static void main(String[] args) {
// task1

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

//task2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

//task 3
        int year = 2020;
        if (year %4 == 0 && year %100 != 0 || year %400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

//task 4
        int deliveryDistance = 155;
        int intervalDistance = 40;
        int startDistance = 20;
        int deliveryDays = 1;
        if (deliveryDistance <= startDistance) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + ((deliveryDistance - startDistance) / intervalDistance) + 1;
        }
            System.out.println("Потребуется дней " + deliveryDays);

//task 4
        int monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
            System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");}
}
}