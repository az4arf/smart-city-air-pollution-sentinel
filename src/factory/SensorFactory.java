/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import models.CO2Sensor;
import models.DustSensor;
import models.Sensor;
import models.SmokeSensor;
/**
 * Factory Pattern
 * Creates sensor objects based on sensor type
 */
public class SensorFactory {
/**
     * Create Sensor Object
     */
    public static Sensor createSensor(String type, String zone) {

        if (type.equalsIgnoreCase("CO2")) {

            return new CO2Sensor(zone);

        }

        else if (type.equalsIgnoreCase("Smoke")) {

            return new SmokeSensor(zone);

        }

        else if (type.equalsIgnoreCase("Dust")) {

            return new DustSensor(zone);

        }

        else {

            return null;

        }
    }
}