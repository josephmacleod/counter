/*
 * Simple text-based user interface for the Counter class.
 */
package counterapplication;

import java.util.Scanner;

public class CounterApplication {

        public static void main(String[] args) {
        int choice;
        Counter pigs = new Counter();
        FancyCounter goats = new FancyCounter();
        Scanner stdin = new Scanner(System.in);

        System.out.println("Welcome to the Tally Counter application");
        System.out.println("1 = Increment, 2 = Decrement, 3 = Reset, 0 = Exit");
        do {
            System.out.println("Number of pigs = " + pigs);
            System.out.println("Number of goats = " + goats);
            System.out.print("Next action: ");
            choice = stdin.nextInt();
            if (choice == 1) {
                pigs.increment();
                goats.increment();
            } else if (choice == 2) {
                goats.decrement();
            } else if (choice == 3) {
                pigs.reset();
                goats.reset();
            } else if (choice != 0) {
                System.out.println("Error: Valid choices are 0, 1 or 2");
            }
        } while (choice != 0);
        System.out.println("Goodbye");
    }
}
