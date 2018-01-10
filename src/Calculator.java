import java.math.BigDecimal;
import java.math.RoundingMode;

class Calculator {
    private BigDecimal total;
    private Double tipPercentage;
    private int numOfPeople;

    BigDecimal getTotal() {
        return total;
    }

    void setTotal(BigDecimal total) {
        this.total = total;
    }

    Double getTipPercentage() {
        return tipPercentage;
    }

    void setTipPercentage(Double tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    int getNumOfPeople() {
        return numOfPeople;
    }

    void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    void setScale() {
        this.total = this.total.setScale(2, RoundingMode.HALF_UP);
    }

    String calculateTotal() {
        Double newTotal = (total.doubleValue() + (total.doubleValue() * tipPercentage / 100)) / numOfPeople;
        BigDecimal temp = new BigDecimal(newTotal).setScale(2, BigDecimal.ROUND_HALF_UP);
        return temp.toString();
    }
}
