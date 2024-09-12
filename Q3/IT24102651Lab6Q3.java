import java.util.Scanner;

public class IT24102651Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;          
        double sumOfSquares = 0; 
        
        System.out.println("Enter positive integers to calculate the Root Mean Square (terminate with -99):");
        
        while (true) {
            int number = scanner.nextInt();
           
            if (number == -99) {
                break;
            }
            
            if (number < 0) {
                System.out.println("Invalid input! Please enter positive integers only.");
                continue;
            }
            
            sumOfSquares += Math.pow(number, 2);
            count++;
        }
      
        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("Root Mean Square of the entered numbers is: " + rms);
        } else {
            System.out.println("No positive numbers were entered.");
        }
        
        scanner.close();
    }
}
