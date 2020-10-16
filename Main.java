
import java.util.Scanner;//Here to allow the scanner to be implemented within the code

class Main1 {
  public static void main(String[] args) {
    System.out.println("Good morning everyone!");// To begin the idea of the program
    System.out.println("Should I go out to the movies today?");
    boolean sunny = false;
    boolean raining = false;
    boolean cloudy = true;
    if (sunny || cloudy)// This is setting the condition so that we can begin the if condition
    {
      System.out.println("I can go out walking");
    } else if (sunny)// setting another condition
    {
      System.out.println("I should go walking, and maybe even use my bike");
    } else {
      System.out.println("I should go in a car, or catch a ride");
    }
    System.out.println("Should I go out with my friends??");// Another condition added to the program's idea
    boolean friendsAvailable = true;
    boolean wantToGo = true;
    if (friendsAvailable && wantToGo) {
      System.out.println("I'll go out with my friends");
    } else {
      System.out.println("I'll just go alone");
    }
    System.out.println("There are lots of nice cars, lets count how many there are");
    for (int count = 1; count <= 5; count++) {
      System.out.println(count);// Counting up for the loop
    }
    System.out.println("My friend said I could count down 10 and see him here");
    int i = 10;//Sets an integer value
    while (i >= 1) {//Sets the lowest that the integer can go within the loop so that it can count down
      System.out.println(i);//Prints out the value of the integer after it executes
      i--;//Subtracts out of the value so that the code can count down
    }
    System.out.println("My friend's finally here");
    System.out.println("Friend: What movie do you want to watch?");// Setting the tone for a scanner statement
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Which Movie do you want to watch?");

    String userName = myObj.nextLine(); // Read user input
    System.out.println("Let's watch " + userName); // Output user input
    Scanner nextObj = new Scanner(System.in);// Create a scanner object
    System.out.println("Friend: What snacks and food should we get?");

    String food = nextObj.nextLine();
    System.out.println("lets eat " + food);
  }
}
