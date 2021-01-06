public class Mac extends Robot{
    private final int maxBattery;
    private final int maxCapacity;

    public Mac(String name, int actualBattery) {
        super(name, actualBattery);
        this.maxBattery = 10;
        this.maxCapacity = 10;
    }

    @Override
    public void oneDay(int maxProducts, int charge) {
        this.load = 0;
        this.actualBattery += charge;
        if (this.actualBattery > this.maxBattery) this.actualBattery = this.maxBattery;

        this.load = this.actualBattery;
        if (this.load > this.maxCapacity) this.load = this.maxCapacity;
        if (this.load > maxProducts) this.load = maxProducts;

        this.actualBattery -= this.load;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
