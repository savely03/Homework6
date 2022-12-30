public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 6");
        task1_2(1, 2014);
        task3(2022);
        task4(71);
        task5(12);
    }

    public static void task1_2(int clientOs, int clientDeviceYear) {
        System.out.println("Задания 1 и 2:");
        String deviceOs = clientOs == 0 ? "IOS" : "Android";
        String versionText = clientDeviceYear < 2015 ? " Установите облегченную версию приложения для " +
                deviceOs + " по ссылке." : " Установите версию приложения " + deviceOs + " по ссылке.";
        System.out.println(versionText);
    }

    public static void task3(int year) {
        System.out.println("Задание 3:");
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(" Это високосный год.");
        } else {
            System.out.println(" Это невисокосный год.");
        }
    }

    public static void task4(int deliveryDistance) {
        System.out.println("Задание 4:");
        if (deliveryDistance <= 20) {
            System.out.println(" Доставка составит 1 сутки.");
        } else if (deliveryDistance <= 60) {
            System.out.println(" Доставка составит 2 суток.");
        } else if (deliveryDistance <= 100) {
            System.out.println(" Доставка составит 3 суток.");
        } else {
            System.out.println(" Доставка свыше 100 км не осуществляется");
        }
    }

    public static void task5(int monthNumber) {
        System.out.println("Задание 5:");
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println(" Сезон - Зима");
            case 3, 4, 5 -> System.out.println(" Сезон - Весна");
            case 6, 7, 8 -> System.out.println(" Сезон - Лето");
            case 9, 10, 11 -> System.out.println(" Сезон - Осень");
        }
    }
}