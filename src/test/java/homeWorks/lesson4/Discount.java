package homeWorks.lesson4;

public class Discount {
    private Integer volume;
    private Integer amountOfDay;
    private Character Symbol;
    private Integer minItemCount;
    private Integer minSum;

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getAmountOfDay() {
        return amountOfDay;
    }

    public void setAmountOfDay(Integer amountOfDay) {
        this.amountOfDay = amountOfDay;
    }

    public Character getSymbol() {
        return Symbol;
    }

    public void setSymbol(Character symbol) {
        Symbol = symbol;
    }

    public Integer getMinItemCount() {
        return minItemCount;
    }

    public void setMinItemCount(Integer minItemCount) {
        this.minItemCount = minItemCount;
    }

    public Integer getMinSum() {
        return minSum;
    }

    public void setMinSum(Integer minSum) {
        this.minSum = minSum;
    }
}