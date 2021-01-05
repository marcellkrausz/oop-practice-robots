import java.util.ArrayList;
import java.util.List;

public class Simulation {

    private int maxProducts = 0;
    List<Robot> robots = new ArrayList<>();
    List<Day> days = new ArrayList<>();

    public Simulation() {
        robots.add(new Mac("R2",4));
        robots.add(new Eco("3CPO",4));
        robots.add(new Pro("BB8",4));
        robots.add(new Eco("E12",4));

        days.add(new Day(3,20));
        days.add(new Day(2,32));
        days.add(new Day(5,20));
        days.add(new Day(3,16));
    }

    public void simulateDays() {
        for (int i = 0; i < days.size(); i++) {
            maxProducts += days.get(i).products;
            System.out.println(maxProducts);
            for (int j = 0; j < robots.size(); j++) {
                robots.get(j).oneDayOfRobot(maxProducts, days.get(i).charge);
                maxProducts -= robots.get(j).getLoad();
                System.out.println(robots.get(j));
            }
        }
        System.out.println(maxProducts + " products left in the storage after 4 days.");
    }
}