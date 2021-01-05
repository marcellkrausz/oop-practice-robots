public abstract class Robot {

    private final String name;
    private Integer actualBattery;
    private Integer load;
    private Integer maxBattery;
    private Integer maxCapacity;

    public Robot (String name, Integer actualBattery) {
        this.name = name;
        this.actualBattery = actualBattery;
    }

    public abstract void oneDayOfRobot(Integer maxProducts, Integer charge);

    public String getName() {
        return name;
    }

    public Integer getActualBattery() {
        return actualBattery;
    }

    public void setActualBattery(Integer actualBattery) {
        this.actualBattery = actualBattery;
    }

    public Integer getLoad() {
        return load;
    }

    public void setLoad(Integer load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return getName() + " taken " + getLoad() + " products and has " + getActualBattery() + " charge.";
    }
}
