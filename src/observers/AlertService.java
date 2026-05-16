package observers;

public class AlertService implements Observer {

    @Override
    public void update(int pollutionLevel) {

        if (pollutionLevel > 70) {
            System.out.println("ALERT: High Pollution!");
        }

    }
}