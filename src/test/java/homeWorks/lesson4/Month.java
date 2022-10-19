package homeWorks.lesson4;

public class Month {
    private String monthName;
    private Integer amountOfDay;
    private Integer amountOfWeekends;
    private String season;
    private Integer amountOfHours;

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public Integer getAmountOfDay() {
        return amountOfDay;
    }

    public void setAmountOfDay(Integer amountOfDay) {
        this.amountOfDay = amountOfDay;
    }

    public Integer getAmountOfWeekends() {
        return amountOfWeekends;
    }

    public void setAmountOfWeekends(Integer amountOfWeekends) {
        this.amountOfWeekends = amountOfWeekends;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Integer getAmountOfHours() {
        return amountOfHours;
    }

    public void setAmountOfHours(Integer amountOfHours) {
        this.amountOfHours = amountOfHours;
    }
}
