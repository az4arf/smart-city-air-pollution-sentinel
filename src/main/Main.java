package main;

import services.CityControlCenter;

public class Main {

    public static void main(String[] args) {

        CityControlCenter system =
                CityControlCenter.getInstance();

        system.start();
    }
}