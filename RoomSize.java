
/**
 * An object RoomSize with the name, length, and width of the room
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 10/25/2026
 * 
 */
public class RoomSize
{
    
    private String name;
    private double length;
    private double width;

    /**
     * Create an object RoomSize with the inputed name, length, and width.
     * 
     * @param inName Name provided for the room
     * @param inLen Length provided for the room
     * @param inWidth Width provided for the room
     */
    public RoomSize(String inName, double inLen, double inWidth)
    {
        name = inName;
        length = inLen;
        width = inWidth;
    
    }

    /**
     * Create an object RoomSize with the inputed object's name, length, and width.
     * 
     * @param object2 Inputed roomsize object
     */
    public RoomSize(RoomSize object2)
    {
        name = object2.name;
        length = object2.length;
        width = object2.width;
        
    }
    
    /**
     * Finds the area of the room with multipling length and width of the room
     *
     * @return Area of the room
     */
    public double getArea()
    {
        
        return length * width;
    }
    
    /**
     * Gets the string to display the room name, length, width and area.
     *
     * @return The String containing the room name, length, width and area of the room
     */
    public String toString()
    {
        
        return String.format("\nRoom Name: %s\nLength: %.1f\nWidth: %.1f\nArea: %.2f\n", name, length, width, getArea());
    }
}