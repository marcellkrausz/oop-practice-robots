public abstract class Robot {
    private final String name;
    protected int actualBattery;
    protected int load;

    public Robot(String name, int actualBattery) {
        this.name = name;
        this.actualBattery = actualBattery;
    }

    public abstract void oneDay(int maxProducts, int charge);

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + " has taken " + this.load + " products and has " + this.actualBattery + " charge.";
    }
}
