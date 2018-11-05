/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycledemo;

/**
 *
 * @author paulb
 */
public class RoadBike extends Bicycle {
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    private int maximumMPH;

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed += increment;   
    }

    void applyBrakes(int decrement) {
         speed -= decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
