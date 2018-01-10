import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        //TODO: try and catch for wrong types
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("How much is on the bill?");
        System.out.print("$");
        calc.setTotal(new BigDecimal(String.valueOf(sc.nextDouble())));
        System.out.println("How much (percentage) would you like to tip?");
        calc.setTipPercentage(sc.nextInt());
        System.out.println("How many people are paying?");
        calc.setNumOfPeople(sc.nextInt());
        calc.setScale();
        if (calc.getNumOfPeople() == 1) {
            System.out.println("You need to pay $" + calc.calculateTotal());
        } else {

        }
        sc.close();
    }
}
