import java.math.BigDecimal;
import java.math.RoundingMode;

class Calculator {
    private BigDecimal total;
    private int tipPercentage;
    private int numOfPeople;

    Calculator() {
        total = total.setScale(2, RoundingMode.HALF_UP);
    }

    BigDecimal getTotal() {
        return total;
    }

    void setTotal(BigDecimal total) {
        this.total = total;
    }

    int getTipPercentage() {
        return tipPercentage;
    }

    void setTipPercentage(int tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    int getNumOfPeople() {
        return numOfPeople;
    }

    void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    String calculateTotal() {
        Double toReturn = (total.doubleValue() + (total.doubleValue() * tipPercentage)) / numOfPeople;
        return String.valueOf(toReturn);
    }
}
