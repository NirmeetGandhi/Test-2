import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

     
        List<Integer> numbers = new ArrayList<>();

  
        System.out.println("Enter numbers (enter -1 to finish):");

        int number;
        do {
            number = scanner.nextInt();
            if (number != 0) {
                numbers.add(number);
            }
        } while (number != -1);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = 0.0;
        if (!numbers.isEmpty()) {
            average = (double) sum / numbers.size();
        }

        System.out.println("Average: " + average);

    }
}
