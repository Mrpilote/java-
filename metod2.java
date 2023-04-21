package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class metod2 {
    public static void main(String[] args) throws IOException {
        System.out.print("Какое число использывать?: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberString = reader.readLine();
        try {
            int number = Integer.parseInt(numberString);
            System.out.println(isPrime(number));
        }catch (NumberFormatException f){
            System.out.println("Вы ввели не число");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int f = 2; f <= Math.sqrt(num); f++) {
            if (num % f == 0) {
                return false;
            }
        }
        return true;
    }
}
