package homeWorks.lesson4;

public class Book  {
    private String name;
    private Integer numberOfSheets;
    private long numberOfLetter;
    private Integer numberOfChapter;
    private Integer price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setNumberOfSheets(Integer numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public long getNumberOfLetter() {
        return numberOfLetter;
    }

    public void setNumberOfLetter(long numberOfLetter) {
        this.numberOfLetter = numberOfLetter;
    }

    public Integer getNumberOfChapter() {
        return numberOfChapter;
    }

    public void setNumberOfChapter(Integer numberOfChapter) {
        this.numberOfChapter = numberOfChapter;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
