import java.math.BigDecimal;

class Calculator {
    private BigDecimal total;
    private int tipPercentage;
    private int numOfPeople;

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

}
