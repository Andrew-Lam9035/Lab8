import java.util.Scanner;
/**
 * Driver for RoomSize and CarpetCost
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 10/25/2026
 * 
 */
public class CarpetCostDemo
{
    public static void main(String[] args){
        String nameInput, clearInput; double lengthInput, widthInput, costInput; 
        int continueInput = 0; //For while pit
        Scanner keyboard = new Scanner(System.in);
        
        do{ //A do-while loop to keep getting the room name, length, width, and cost from user.
            System.out.print("Enter Room Name: ");
            nameInput = keyboard.nextLine();
        
            System.out.print("Enter room length: ");
            lengthInput = keyboard.nextDouble();
        
            System.out.print("Enter room width: ");
            widthInput = keyboard.nextDouble();
        
            System.out.print("Enter cost per square foot: ");
            costInput = keyboard.nextDouble();
        
            clearInput = keyboard.nextLine();
        
            if (continueInput == 0){
            
                RoomSize room = new RoomSize(nameInput, lengthInput, widthInput); 
                RoomSize temp = new RoomSize(room);
                //Create temp for RoomSize for the first test case
        
                CarpetCost carpet = new CarpetCost(temp, costInput);
        
                System.out.println(carpet.toString());
        
            }
        
            else {
            
                CarpetCost carpet = new CarpetCost(new RoomSize(nameInput, lengthInput, widthInput), costInput);
                //Using CarpetCost constructor without temp by calling the RoomSize constructor
                //for the second test case
        
                System.out.println(carpet.toString());
        
            }
    
        
        
            System.out.print("Enter 1 to continue: ");
            continueInput = keyboard.nextInt();

            clearInput = keyboard.nextLine();
            System.out.println();
        
        }while(continueInput == 1);
        
    }
}