import java.math.BigDecimal;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        //TODO: negatives
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("How much is on the bill?");
        System.out.print("$");
        while (!sc.hasNextDouble()) {
            System.out.print("Please enter a valid amount.\n$");
            sc.next();
        }
        calc.setTotal(new BigDecimal(String.valueOf(sc.nextDouble())));
        sc.nextLine();

        System.out.println("How much (percentage) would you like to tip?");
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid percentage.\n");
            sc.next();
        }
        calc.setTipPercentage(sc.nextInt());

        System.out.println("How many people are paying?");
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid amount of people.\n");
            sc.next();
        }
        calc.setNumOfPeople(sc.nextInt());
        calc.setScale();
        if (calc.getNumOfPeople() == 1) {
            System.out.println("You need to pay $" + calc.calculateTotal());
        } else {
            System.out.println("Each person should pay $" + calc.calculateTotal() + " split amongst " +
                    calc.getNumOfPeople() + " people.");
        }
        sc.close();
    }
}
