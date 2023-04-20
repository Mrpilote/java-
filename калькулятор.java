import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class калькулятор {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        String number1 = reader.readLine();
        System.out.print("Введите второе число: ");
        String number2 = reader.readLine();
        System.out.print("Введите операцию (+, -, *, /): ");
        String operator = reader.readLine();
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        switch (operator) {
            case "+" -> {
                System.out.print("Результат: " + (num1 + num2));
            }
            case "-" -> {
                System.out.print("Результат: " + (num1 - num2));
            }
            case "*" -> {
                System.out.print("Результат: " + (num1 * num2));
            }
            case "/" -> {
                System.out.print("Результат: " + (num1 / num2));
            }
        }

    }


}

