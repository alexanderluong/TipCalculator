import java.math.BigDecimal;
import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        //TODO: try and catch for wrong types
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("How much is on the bill?");
        calc.setTotal(new BigDecimal(String.valueOf(sc.nextDouble())));
        System.out.println("How much (percentage) would you like to tip?");
        calc.setNumOfPeople(sc.nextInt());
        System.out.println("How many people are paying?");
        calc.setTipPercentage(sc.nextInt());
        if (calc.getNumOfPeople() == 0) {

        } else {

        }
        sc.close();
    }
}
