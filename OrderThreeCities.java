import java.util.Scanner;

public class OrderThreeCities {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String firstCity = input.next();

        System.out.print("Enter the second city: ");
        String secondCity = input.next();

        System.out.print("Enter the third city: ");
        String thirdCity = input.next();

        System.out.println("The three cities in alphabetical order are "
        + firstCity + " " + secondCity + " " + thirdCity);


        
    }
    


}
