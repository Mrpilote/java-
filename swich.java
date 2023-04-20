import java.util.Scanner;

public class укпа {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> {
                System.out.println("Январь");
            }
            case 2 -> {
                System.out.println("Февраль");
            }
            case 3 -> {
                System.out.println("Март");
            }
            case 4 -> {
                System.out.println("Апрель");
            }
            case 5 -> {
                System.out.println("Май");
            }

            case 6 -> {
                System.out.println("Июнь");
            }
            case 7 -> {
                System.out.println("Июль");
            }
            case 8 -> {
                System.out.println("Август");
            }
            case 9 -> {
                System.out.println("Сентябрь");
            }
            case 10 -> {
                System.out.println("Октябрь");
            }
            case 11 -> {
                System.out.println("Ноябрь");
            }
            case 12 -> {
                System.out.println("Декабрь");
            }
            default -> {
                System.out.println("не тот месяц");
            }
        }


    }


}




