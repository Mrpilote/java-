import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class рпа {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String result = reader.readLine();
            try {
                int number = Integer.parseInt(result);
                System.out.println("Вы ввели число: "+number);
                int y = 1;
                while (y < number){
                    y++;
                    if (y % 3==0){
                        System.out.println(y);
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("Вы не ввели правильное число \""+ result+"\"");
            }



        }
    }
}
