import java.util.*;
public class Program1 {
	    private double a;
	    private double b;
	    private String operation;
	    
	    public Program1(double a, double b, String operation) {
	        this.a = a;
	        this.b = b;
	        this.operation = operation;
	    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------Calculator--------------");
        System.out.print("Enter the first number (a): ");
        double a = scan.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = scan.nextDouble();

        scan.nextLine();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = scan.nextLine();

        try {
            Program1 pgm = new Program1(a, b, operation);
            double result = pgm.calculate();
            System.out.println("Result: " + result);
            System.out.println("---------------------------------------");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
	
	public double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
            default:
                throw new IllegalArgumentException("Invalid operation type.");
        }
    }
}
		
	
