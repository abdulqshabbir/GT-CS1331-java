import java.util.Scanner;

public class FarToCelFormatted {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Farenheit value:");
        int far = input.nextInt();
        System.out.print("Enter a day of the week:");
        String day = input.next();
        double cel = (5.0/9)*(far - 32);
        System.out.printf("%s in Farenheit is %d\n", day, far);
        System.out.printf("%s in %-9s is %.1f\n", day, "Celcius", cel);
        input.close();
    }
}