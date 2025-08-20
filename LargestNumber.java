package ragavendran;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        int largest = findLargest(num1, num2, num3);
        
        System.out.println("The largest number is: " + largest);
        
        scanner.close();
    }

    public static int findLargest(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
}
