import java.util.Scanner;


public class LinearEquationRunner {
    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);
        //welcomes the user
        System.out.println("Welcome!");

        //gets the first coordinates and stores it as integer variables
        System.out.print("Enter coordinate 1: ");
        String userInput = scan.nextLine();
        int comma = userInput.indexOf(",");
        String stringX = userInput.substring(1, comma);
        String stringY = userInput.substring(comma +2, userInput.length()-1);
        int x1 = Integer.parseInt(stringX);
        int y1 = Integer.parseInt(stringY);
        System.out.println(" " + x1 + " " +y1);

        //gets the second coordinates and stores it as integer variables
        System.out.print("Enter coordinate 2: ");
        String userInput2 = scan.nextLine();
        comma = userInput2.indexOf(",");
        String stringX2 = userInput2.substring(1, comma);
        String stringY2 = userInput2.substring(comma +2, userInput2.length()-1);
        int x2 = Integer.parseInt(stringX2);
        int y2 = Integer.parseInt(stringY2);
        System.out.println(" " + x2 + " " +y2);

        LinearEquation equa1 = new LinearEquation(x1,y1,x2,y2);
        System.out.println(equa1.distance());
        System.out.println(equa1.slope());
        System.out.println(equa1.yIntercept());
        System.out.println(equa1.equation());

    }
}
