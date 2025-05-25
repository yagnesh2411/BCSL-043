// Exercise 16: Write a program in Java to display name and roll number of students. 
// Initialize respective array variables for 10 students. Handle ArrayIndexOutOfBoundsException, 
// so that any such problem doesn’t cause illegal termination of program.
public class Exc16 {
    public static void main(String[] args) {
        String[] names = {
            "Alice", "Bob", "Charlie", "David", "Eva",
            "Frank", "Grace", "Helen", "Ivy", "Jack"
        };
        int[] rollNumbers = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Name: " + names[i] + ", Roll Number: " + rollNumbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index that is out of bounds.");
            System.out.println("Please ensure you are accessing valid indices within the array.");
        }
        System.out.println("All student details displayed successfully! Learning to handle exceptions makes your code robust.");
    }
}
