import java.util.*;

public class Class {

    public static void main(String args[]) {
        try {
            System.out.println("Please enter your annual tax income");
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();

            if (a >= 1 && a <= 216200) {
                System.out.println(a * 0.18);
            } else if (a >= 216201 && a <= 337800) {
                System.out.println(a - (38916 * 0.26));
            } else if (a >= 337801 && a <= 467500) {
                System.out.println(a - (70532 * 0.31));
            } else if (a >= 467501 && a <= 613600) {
                System.out.println(a - (110739 * 0.36));
            } else if (a >= 613601 && a <= 782200) {
                System.out.println(a - (163335 * 0.39));
            } else if (a >= 782201 && a <= 1656600) {
                System.out.println(a - (229089 * 0.41));
            } else if (a >= 1656601) {
                System.out.println(a - (587593 * 0.45));
            }

        } catch (Exception e) {
            System.out.println("Invalid Input. Please Try Again");

        }
    }
}