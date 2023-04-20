import java.util.Scanner;

public class хуята {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш iq: ");
        int iq = scanner.nextInt();
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();


        if (iq + age < 80)
            System.out.println("Поздравляю вы тупой!!!");

        else if (iq + age > 80)
            System.out.print("Поздравляю вы не тупой!!!");

    }
}
