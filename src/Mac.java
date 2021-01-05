public class Mac extends Robot {

    private final Integer maxBattery;
    private final Integer maxCapacity;

    public Mac(String name, Integer actualBattery) {
        super(name, actualBattery);
        this.maxBattery = 10;
        this.maxCapacity = 10;
    }

    @Override
    public void oneDayOfRobot(Integer maxProducts, Integer charge) {
        setLoad(0);
        setActualBattery(getActualBattery() + charge);
        if (getActualBattery() > this.maxBattery) setActualBattery(this.maxBattery);

        setLoad(getActualBattery());
        if (getLoad() > this.maxCapacity) setLoad(this.maxCapacity);
        if (getLoad() > maxProducts) setLoad((maxProducts));
        setLoad(getActualBattery() - getLoad());
    }
}
