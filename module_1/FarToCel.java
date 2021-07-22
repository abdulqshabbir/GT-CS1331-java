import java.lang.System;
import java.util.Scanner;

public class FarToCel {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type in temperature in farenheit:");
        int far_value = input.nextInt();
        double cel_value = (5.0/9)*(far_value - 32);
        System.out.print("The temperature in celcius is: " + cel_value);
    }
}