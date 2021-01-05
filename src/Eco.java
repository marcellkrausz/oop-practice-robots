public class Eco extends Robot{
    private final Integer maxBattery;
    private final Integer maxCapacity;

    public Eco(String name, Integer actualBattery) {
        super(name, actualBattery);
        this.maxBattery = 4;
        this.maxCapacity = 8;
    }

    @Override
    public void oneDayOfRobot(Integer maxProducts, Integer charge) {
        setLoad(0);
        setActualBattery(getActualBattery() + charge);
        if (getActualBattery() > this.maxBattery) setActualBattery(this.maxBattery);

        if (getActualBattery() <= 5) {

        }
        if (getLoad() > this.maxCapacity) setLoad(this.maxCapacity);
        if (getLoad() > maxProducts) setLoad((maxProducts));
        if (getLoad() % 2 == 1) {
            setActualBattery(getActualBattery() - ((getLoad() + 1) / 2));
        }else {
            setActualBattery(getActualBattery() - getLoad() / 2);
        }
    }
}
