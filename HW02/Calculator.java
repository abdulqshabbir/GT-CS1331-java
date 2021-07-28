import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation:");

        String operation = input.next();
        operation = operation.toLowerCase();

        switch(operation) {
            case "add":
                try {
                    System.out.println("Enter two integers:");
                    int a = input.nextInt();
                    int b = input.nextInt();
                    int sum = a + b;
                    System.out.println("Answer: " + sum);
                    break; 
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            case "subtract":
                try {
                    System.out.println("Enter two integers:");
                    int c = input.nextInt();
                    int d = input.nextInt();
                    int difference = c - d;
                    System.out.println("Answer: " + difference);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            case "multiply":
                try {
                    System.out.println("Enter two doubles:");
                    double e = input.nextDouble();
                    double f = input.nextDouble();
                    double product = e * f;
                    System.out.printf("Answer: %.2f\n", product); 
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            case "divide":
                try {
                    System.out.println("Enter two doubles:");
                    double g = input.nextDouble();
                    double h = input.nextDouble();
                    double quotient = g/h;
                    if (h != 0) {
                        System.out.printf("Answer: %.2f\n", quotient); 
                    } else {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            case "alphabetize":
                try {
                    System.out.println("Enter two words:");
                    String first = input.next(); 
                    String second = input.next();
                    String firstLower = first.toLowerCase();
                    String secondLower = second.toLowerCase();
                    
                    if (firstLower.compareTo(secondLower) < 0) {
                        System.out.println("Answer: " + first + " comes before " + second + " alphabetically.");
                    } else if (firstLower.compareTo(secondLower) > 0) {
                        System.out.println("Answer: " + second + " comes before " + first + " alphabetically.");
                    } else {
                        System.out.println("Answer: Chicken or Egg.");
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            default:
                System.out.println("Invalid input entered. Terminating...");
                break;
        }

        input.close();
    }    
}
