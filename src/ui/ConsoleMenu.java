package ui;

import java.util.Scanner;
import services.CityControlCenter;

public class ConsoleMenu {

    private CityControlCenter system;

    public ConsoleMenu(CityControlCenter system) {
        this.system = system;
    }

    public void showMenu() {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Enter Pollution Data");
            System.out.println("2. Exit");

            int choice = input.nextInt();

            if (choice == 1) {

                System.out.print("Enter Zone: ");
                String zone = input.next();

                System.out.print("Enter CO2: ");
                int co2 = input.nextInt();

                System.out.print("Enter Smoke: ");
                int smoke = input.nextInt();

                System.out.print("Enter Dust: ");
                int dust = input.nextInt();

                system.processPollutionData(zone, co2, smoke, dust);
            }

            if (choice == 2) break;
        }
    }
}