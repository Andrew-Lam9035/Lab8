
/**
 * An object odometer to track the car's current mileage
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 10/26/2026
 */
public class Odometer
{
    // instance variables - replace the example below with your own
    private FuelGauge gauge;
    private int mileage;
    private int milesSinceAddingFuel;

    /**
     * Creates an object Odometer using the FuelGauge object carGauge and inputed fuelMileage.
     * 
     * @param FuelGauge object provided for the car
     * @param Mileage of the car
     */
    public Odometer(FuelGauge carGauge, int fuelMileage)
    {
        gauge = new FuelGauge(carGauge);
        mileage = fuelMileage;
        milesSinceAddingFuel = 0;
        
    }

    /**
     * Returns the current mileage of the car
     *
     * @return The current mileage of the car
     */
    public int CurrentMileage()
    {
        return mileage;
    }
    
    /**
     * Returns the current mileage of the car
     *
     * @return The current mileage of the car
     */
    public int CurrentFuelAmount()
    {
        
        return gauge.CurrentFuelLevel();
        
    }
    
    /**
     * Increases the odometer mileage by one mile until resetting the mileage to 0 when 
     * exceeding 999999 mile. If the car mileage increases by 24 miles, then calls 
     * gauge.ConsumeFuel() to consume one gallon of fuel.
     * 
     *
     */
    public void IncrementMileage()
    {
        mileage++;
        
        if(mileage > 999999) {
            
            mileage = 0;
            
        }
        
        
        milesSinceAddingFuel++;
        
        if(milesSinceAddingFuel % 24 == 0){
            
            milesSinceAddingFuel = 0;
            gauge.ConsumeFuel();
        }
        
    }
}