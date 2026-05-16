package services;

import ui.ConsoleMenu;

public class CityControlCenter {

    private static CityControlCenter instance;

    private CityControlCenter() {}

    public static CityControlCenter getInstance() {
        if (instance == null) {
            instance = new CityControlCenter();
        }
        return instance;
    }

    public void start() {
        ConsoleMenu menu = new ConsoleMenu(this);
        menu.showMenu();
    }

    // هذه الدالة تربط النظام (مهمّة)
    public void processPollutionData(String zone, int co2, int smoke, int dust) {

        int max = Math.max(co2, Math.max(smoke, dust));

        String status;

        if (max <= 50) status = "SAFE";
        else if (max <= 100) status = "MODERATE";
        else if (max <= 150) status = "WARNING";
        else if (max <= 200) status = "DANGEROUS";
        else status = "CRITICAL";

        System.out.println("\nZone " + zone + " Status: " + status);

        if (max > 150) {
            System.out.println("[ALERT] High pollution detected in " + zone);
        }
    }
}