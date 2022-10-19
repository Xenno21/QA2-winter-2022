package homeWorks.lesson4;

import java.math.BigDecimal;

public class Wood {

    private String nameOfPlace;
    private long quantityOfThrees;
    private Integer area;
    private float height;
    private BigDecimal cost;

    public String getNameOfPlace() {
        return nameOfPlace;
    }

    public void setNameOfPlace(String nameOfPlace) {
        this.nameOfPlace = nameOfPlace;
    }

    public long getQuantityOfThrees() {
        return quantityOfThrees;
    }

    public void setQuantityOfThrees(long quantityOfThrees) {
        this.quantityOfThrees = quantityOfThrees;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
