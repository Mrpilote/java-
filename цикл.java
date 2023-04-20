public class цикл {
    public static void main(String[] args) {
        int y = 0;
        while (y < 100) {
            y++;
            if (y % 3==0 && y % 5==0)
                System.out.println("FizzBuzz");
            if (y % 3 == 0)
                System.out.println("Fizz");
            else if (y % 5 == 0)
                System.out.println("Buzz");
             else
                System.out.println(y);

        }

    }
}
