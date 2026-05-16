package observers;

public class ReportLogger implements Observer {

    @Override
    public void update(int pollutionLevel) {

        System.out.println("Report Saved: " + pollutionLevel);

    }
}