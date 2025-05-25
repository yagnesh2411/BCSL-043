import java.util.Scanner;

public class Exc17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
           try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
           }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index that is out of bounds.");
            System.out.println("Please ensure you are accessing valid indices within the array.");
        }
            
    }
}