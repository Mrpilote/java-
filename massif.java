package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class massif {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите 5 чисел: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summ = 0;
        for (int i = 0; i < 5; i++) {
            String numbers = reader.readLine();
            try {
                int number = Integer.parseInt(numbers);
                summ = number + summ;
            } catch (NumberFormatException f) {
                System.out.println("Вы ввели не число");
            }
        }

        System.out.println("Сумма чисел: "+ summ);
        System.out.println("Среднее арифметическое: " + summ / 5);
    }
}
