public class Main {
    public static void main(String[] args) {
        char clientOS = '1';
        if (clientOS == '1') {
            System.out.println("Установите версию приложения Android по ссылке");
        } else {
            if (clientOS == '0') {
                System.out.println("Установите версию приложения iOS по ссылке");
            }
        }
        int yearOfMan = 2018;
        if (clientOS == '1' && yearOfMan < 2015) {
            System.out.println("Установите облегченную версию приложения Android по ссылке");
        } else {
            if (clientOS == '0' && yearOfMan < 2015) {
                System.out.println("Установите облегченную версию приложения iOS по ссылке");
            } else {
                if (clientOS == '1' && yearOfMan > 2015) {
                    System.out.println("Установите полную версию приложения Android по ссылке");
                } else {
                    if (clientOS == '0' && yearOfMan > 2015) {
                        System.out.println("Установите полную версию приложения iOS по ссылке");
                    }
                }
            }

        }
        int year = 2025;
        if (year % 4 == 0 && year % 100 != 0 && year >= 1584) System.out.println(year + " является високосным");
        else {
            System.out.println(year + " не является високосным");
        }
        int deliveryDistance = 95;
        int time = 1;
        if (deliveryDistance < 20) {
            System.out.println(time = 1);
        } else {
            if (deliveryDistance > 20 && deliveryDistance < 60) {
                System.out.println("Потребуется дней " + (time = time + 1));
            } else {
                if (deliveryDistance > 60 && deliveryDistance < 100) {
                    System.out.println("Потребуется дней " + (time = time + 2));
                } else {
                    if (deliveryDistance > 100) {
                        System.out.println("Доставки нет");

                    }
                }
            }
        }
        int monthNumber=12;
        switch (monthNumber){
        case 1:
            System.out.println("Зима");
            break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
            System.out.println("Такого месяца не существует");

    }
}
}
