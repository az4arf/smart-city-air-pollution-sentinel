package observers;

public class Dashboard implements Observer {

    @Override
    public void update(int pollutionLevel) {

        System.out.println("Dashboard Updated: " + pollutionLevel);

    }
}