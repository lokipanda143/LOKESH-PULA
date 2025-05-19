import java.util.*;
public class Program3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        try {
            System.out.print("Enter a number (a): ");
            int a = scan.nextInt();

            if (a <= 0) {
                System.out.println("Please enter a positive number.");
            } 
            else {
            	int terms=(a%2==0) ? a-1 : a;
                System.out.print("Output: ");
                for (int i = 0; i < terms; i++){
                    int value = 2 * i + 1;
                    System.out.print(value);
                    if (i < terms - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
	}	
}

		
	
