package homeWorks.lesson4;

public class Banknote {
    private char currencySymbol;
    private String currencyName ;
    private int currencyVolume;
    private double priceInEuro;

    public char getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(char currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public int getCurrencyVolume() {
        return currencyVolume;
    }

    public void setCurrencyVolume(int currencyVolume) {
        this.currencyVolume = currencyVolume;
    }

    public double getPriceInEuro() {
        return priceInEuro;
    }

    public void setPriceInEuro(double priceInEuro) {
        this.priceInEuro = priceInEuro;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    private String colour;


}
