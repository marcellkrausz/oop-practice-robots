import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private int maxProducts = 0;
    List<Robot> robots = new ArrayList<>();
    List<Day> days = new ArrayList<>();

    public Simulation() {
        robots.add(new Mac("R2",4));
        robots.add(new Eco("3CPO",3));
        robots.add(new Pro("BB8",10));
        robots.add(new Eco("E12",4));

        days.add(new Day(3,20));
        days.add(new Day(2,32));
        days.add(new Day(5,20));
        days.add(new Day(3,16));
    }

    public void simulateDays() {
        for (int i = 0; i < days.size(); i++) {
            maxProducts += days.get(i).products;
            for (int j = 0; j < robots.size(); j++) {
                robots.get(j).oneDay(maxProducts, days.get(i).charge);
                maxProducts -= robots.get(j).load;
                System.out.println(robots.get(j));
            }
            System.out.println(maxProducts + " products in the storage at the end of the " + (i + 1) + " day.");
            System.out.println();
        }
    }
}
