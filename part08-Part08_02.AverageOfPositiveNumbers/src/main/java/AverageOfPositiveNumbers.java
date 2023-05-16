
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while(true){
            int i = Integer.valueOf(scanner.nextLine());

            if(i == 0) break;

            if(i > 0){
                sum += i;
                count++;
            }
        }

        if(count == 0)
        {System.out.println("Cannot calculate the average");

        }else {
            System.out.println((double) sum / count);
        } 
    }
}
