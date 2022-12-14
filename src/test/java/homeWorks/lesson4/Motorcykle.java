package homeWorks.lesson4;

public class Motorcykle {
    private String name;
    private Integer model;
    private Double engineDisplacement;
    private char engineType;
    private Double tankVolume ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(Double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public char getEngineType() {
        return engineType;
    }

    public void setEngineType(char engineType) {
        this.engineType = engineType;
    }

    public Double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(Double tankVolume) {
        this.tankVolume = tankVolume;
    }
}

