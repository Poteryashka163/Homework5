public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int yearРroduction = 2014;
        if (clientOS == 1)
            if (yearРroduction > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");}
                    else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");}

        if (clientOS == 0)
            if (yearРroduction > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");}
                else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");}
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        int year4 = year % 4;
        int year100 = year % 100;
        int year400 = year % 400;
        if (year4 == 0 && year100 > 0){
            System.out.println(""+year+" год является високосным.");
        }
        else if (year400 == 0 && year100 == 0){
            System.out.println(year+" год является високосным.");
        }
        else if (year100 == 0) {
            System.out.println(year + " год не является високосным.");
        }
        else {
            System.out.println(year + " год не является високосным.");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 44;
        int day = 0;
        if (deliveryDistance <= 20){
            int deliveryDay = day + 1;
            System.out.println("Потребуется дней для доставки: "+deliveryDay);
        } else if (deliveryDistance >20 && deliveryDistance <= 60) {
            int deliveryDay = day + 2;
            System.out.println("Потребуется дней для доставки: "+deliveryDay);
        }
        else if (deliveryDistance >60 && deliveryDistance <= 100) {
            int deliveryDay = day + 3;
            System.out.println("Потребуется дней для доставки: "+deliveryDay);}
        else {
            System.out.println("Доставки нет!");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь.Зимний сезон.");
                break;
            case 2:
                System.out.println("Февраль.Зимний сезон.");
                break;
            case 3:
                System.out.println("Март.Весенний сезон.");
                break;
            case 4:
                System.out.println("Апрель.Весенний сезон.");
                break;
            case 5:
                System.out.println("Май.Весенний сезон.");
                break;
            case 6:
                System.out.println("Июнь.Летний сезон.");
                break;
            case 7:
                System.out.println("Июль.Летний сезон.");
                break;
            case 8:
                System.out.println("Август.Летний сезон.");
                break;
            case 9:
                System.out.println("Сентябрь.Осенний сезон.");
                break;
            case 10:
                System.out.println("Оклябрь.Осенний сезон.");
                break;
            case 11:
                System.out.println("Ноябрь.Осенний сезон.");
                break;
            case 12:
                System.out.println("Декабрь.Зимний сезон.");
                break;
            default:
                System.out.println("Такого месяца нет!");
        }
    }
}