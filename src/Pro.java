public class Pro extends Robot {
    private final Integer maxBattery;
    private final Integer maxCapacity;

    public Pro(String name, Integer actualBattery) {
        super(name, actualBattery);
        this.maxBattery = 12;
        this.maxCapacity = 12;
    }

    @Override
    public void oneDayOfRobot(Integer maxProducts, Integer charge) {
        setLoad(0);
        setActualBattery(getActualBattery() + charge);
        if (getActualBattery() > this.maxBattery) setActualBattery(this.maxBattery);

        if (getActualBattery() <= 5) {
            setLoad(getActualBattery());
        } else {
            if (getActualBattery() % 2 == 0) {
                setLoad(5 + (((getActualBattery() - 5) + 1)/ 2));
            } else {
                setLoad(5 + ((getActualBattery() - 5) / 2));
            }
        }
        if (getLoad() > this.maxCapacity) setLoad(this.maxCapacity);
        if (getLoad() > maxProducts) setLoad(maxProducts);

        if (getLoad() <= 5) {
            setActualBattery(getActualBattery() - getLoad());
        } else {
            setActualBattery((getActualBattery() - 5) - ((getLoad() - 5) * 2));
        }
    }
}
