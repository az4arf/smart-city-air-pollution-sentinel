/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
/**
 * Base Sensor Class
 * Represents any pollution sensor in the smart city system
 */
public abstract class Sensor {

    protected String sensorName;
    protected int value;
    protected String zone;
/**
     * Constructor
     */
    public Sensor(String sensorName, String zone) {

        this.sensorName = sensorName;
        this.zone = zone;

    }
/**
     * Set pollution value manually
     */
    public void setValue(int value) {

        this.value = value;

    }
/**
     * Get pollution value
     */
    public int getValue() {

        return value;

    }
/**
     * Get sensor name
     */
    public String getSensorName() {

        return sensorName;

    }
/**
     * Get zone name
     */
    public String getZone() {

        return zone;

    }

    /**
     * Display sensor information
     */
    public void displayInfo() {

        System.out.println("Sensor Type : " + sensorName);
        System.out.println("Zone        : " + zone);
        System.out.println("Value       : " + value);

    }
}
   
