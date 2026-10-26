/**
 * An object FuelGauge which has the amount of fuel in the tank of the car
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 10/26/2026
 */
public class FuelGauge
{
    private int fuelLevel;
    private final int maxFuelLevel = 15;

    /**
     * Create an object with the inputed amount of fuel
     * 
     * @param fuelStarting Starting amount of fuel in the car
     */
    public FuelGauge(int fuelStarting)
    {
        
        fuelLevel = fuelStarting;
        
    }

    /**
     * Create an object with the inputed object's fuel level
     * 
     * @param object2 Inputed FuelGauge object
     */
    public FuelGauge(FuelGauge object2)
    {
        
        fuelLevel = object2.fuelLevel;
        
    }
    
    /**
     * Adds fuel to the car to fill up to the max fuel level 15 gallons
     *
     */
    public void FillUp()
    {
        
        fuelLevel = maxFuelLevel;
        
    }
    
    /**
     * Returns the amount of fuel left in the car
     *
     * @return The fuel level in the car
     */
    public int CurrentFuelLevel()
    {
        
        return fuelLevel;
        
    }
    
    /**
     * If the fuelLevel isn't 0, then consumes one gallon of fuel from fuel level.
     *
     */
    public void ConsumeFuel()
    {
        
        if (fuelLevel > 0) {
        
            fuelLevel--;
            
        }
        
    }
}