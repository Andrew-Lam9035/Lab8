
/**
 * An object CarpetCost with the object RoomSize and the cost per sq ft
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 10/25/2026
 * 
 */
public class CarpetCost
{
    
    private RoomSize size;
    private double costPerSqFt;

    /**
     * Creates an object CarpetCost using the RoomSize object area and inputed cost.
     * 
     * @param area RoomSize object provided for the room
     * @param cost Cost provided per square ft for the room
     */
    public CarpetCost(RoomSize area, double cost)
    {
        size = new RoomSize(area);
        costPerSqFt = cost;
        
    }

    /**
     * Finds the total cost of the carpet by multiplying costPerSqFt
     * with the area of the room
     * 
     * @return The total cost of the carpet
     */
    public double getCost()
    {
        
        return (costPerSqFt * size.getArea());
        
    }
    
    /**
     * Gets the string to display the room name, length, width, area, cost per sq ft, and total cost
     * using toString from RoomSize with room name, length, width, and area
     * and costPerSqFt and getCost()
     *
     * @return The String containing the room name, length, width, area, cost per sq ft, and total cost of the room
     */
    public String toString()
    {
        
        return (size.toString() + String.format("The cost per sq ft is: $%.2f\nThe total cost is: $%.2f\n", costPerSqFt, getCost()));
        
    }
}