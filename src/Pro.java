public class Pro extends Robot{
    private final int maxBattery;
    private final int maxCapacity;

    public Pro(String name, int actualBattery) {
        super(name, actualBattery);
        this.maxBattery = 12;
        this.maxCapacity = 8;
    }

    @Override
    public void oneDay(int maxProducts, int charge) {
        this.load = 0;
        this.actualBattery += charge;
        if (this.actualBattery > this.maxBattery) this.actualBattery = this.maxBattery;

        if (this.actualBattery <= 5) {
            this.load = this.actualBattery;
        } else {
            if (this.actualBattery % 2 == 0) {
                this.load = 5 + (((this.actualBattery - 5) - 1) / 2);
            } else {
                this.load = 5 + ((this.actualBattery - 5) / 2);
            }
        }
        if (this.load > this.maxCapacity) this.load = this.maxCapacity;
        if (this.load > maxProducts) this.load = maxProducts;

        if (this.load <= 5) {
            this.actualBattery -= this.load;
        } else {
            this.actualBattery -= (5 + ((this.load - 5) * 2));
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
