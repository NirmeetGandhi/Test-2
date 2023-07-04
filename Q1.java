import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The number is +ve.");
        } else if (number < 0) {
            System.out.println("The number is -ve.");
        } else {
            System.out.println("The number is 0.");
        }
    }
}
