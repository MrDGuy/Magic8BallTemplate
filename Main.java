import java.util.Scanner;  // added to allow keyboard input
class Main {
  public static void main(String[] args) {
     // Tell the user to enter a question
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome to the Magic 8 Ball!");
     System.out.print("Enter your question and I will answer it: ");
     String question = scan.nextLine();
     
     // Get a random number from 1 to 8
       int randomNum = (int)(Math.random()*((8-1)+1))+1;

     // Use if statements to test the random number
       if (randomNum == 1){
           System.out.println("As I see it, yes.");
       }
       if (randomNum == 2){
           System.out.println("Ask again later.");
       }
       if (randomNum == 3){
           System.out.println("Better not tell you now.");
       }
       if (randomNum == 4){
           System.out.println("Cannot predict now.");
       }
       if (randomNum == 5){
           System.out.println("Concentrate and ask again.");
       }
       if (randomNum == 6){
           System.out.println("Don't count on it.");
       }
       if (randomNum == 7){
           System.out.println("It is decidedly so.");
       }
       if (randomNum == 8){
           System.out.println("It is certain.");
       }
     // and print out 1 of 8 random responses




     
   }
}