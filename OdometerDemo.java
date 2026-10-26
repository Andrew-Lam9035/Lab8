/**
 * A driver for FuelGauge and Odometer objects
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 10/26/2026
 */
public class OdometerDemo
{
    public static void main(String[] args){
        
        //Testcase 1: Car1
        FuelGauge Car1 = new FuelGauge(6);
        System.out.println("Car1 gas level: " + Car1.CurrentFuelLevel());
        
        Car1.FillUp();
        System.out.println("\nCar1 is filling up\n");
        
        System.out.println("Car1 gas level: " + Car1.CurrentFuelLevel());
        
        Odometer Car1Meter = new Odometer(Car1, 1000);
        
        System.out.println("\nCar1 is off\n");
        
        System.out.println("------------------\n");
        
        while(Car1Meter.CurrentFuelAmount() > 0){
            
            Car1Meter.IncrementMileage();
            
            System.out.printf("Mileage:  %6d, Fuel(Gal Left): %2d\n", Car1Meter.CurrentMileage(), Car1Meter.CurrentFuelAmount());
            
            
        }
        
        System.out.println("Out of gas!\n");
        
        
        //Testcase 2: Car2
        FuelGauge Car2 = new FuelGauge(8);
        System.out.println("Car2 gas level: " + Car2.CurrentFuelLevel());
        
        Car2.FillUp();
        System.out.println("\nCar2 is filling up\n");
        
        System.out.println("Car2 gas level: " + Car2.CurrentFuelLevel());
        
        Odometer Car2Meter = new Odometer(Car2, 999850);
        
        System.out.println("\nCar2 is off\n");
        
        System.out.println("------------------\n");
        
        while(Car2Meter.CurrentFuelAmount() > 0){
            
            Car2Meter.IncrementMileage();
            
            System.out.printf("Mileage:  %6d, Fuel(Gal Left): %2d\n", Car2Meter.CurrentMileage(), Car2Meter.CurrentFuelAmount());
            
            
        }
        
        System.out.println("Out of gas!\n");
    }
}