public class Eco extends Robot{
    private final int maxBattery;
    private final int maxCapacity;

    public Eco(String name, int actualBattery) {
        super(name, actualBattery);
        this.maxBattery = 4;
        this.maxCapacity = 6;
    }

    @Override
    public void oneDay(int maxProducts, int charge) {
        this.load = 0;
        this.actualBattery += charge;
        if (this.actualBattery > this.maxBattery) this.actualBattery = this.maxBattery;

        this.load = this.actualBattery * 2;
        if (this.load > this.maxCapacity) this.load = this.maxCapacity;
        if (this.load > maxProducts) this.load = maxProducts;

        if (this.load % 2 == 1) {
            this.actualBattery -= ((this.load + 1) / 2);
        } else {
            this.actualBattery -= (this.load / 2);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
