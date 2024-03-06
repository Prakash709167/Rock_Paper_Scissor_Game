import java.util.*;
public class Game {
    public static int count;

    public static void UserChoice(int choice,String Name){
        if (choice == 1) {
            System.out.println(Name + " Choose: Rock");
        } else if (choice == 2) {
            System.out.println(Name + " Choose: Paper");
        } else if (choice == 3) {
            System.out.println(Name + " Choose: Scissors");
        }
    }

    public static void Winner(int x, int y) {
        System.out.println("The wining rules of the game are: ");
        System.out.println("       -->      Between Rock and Paper: Paper Wins");
        System.out.println("       -->      Between Paper and Scissors: Scissors Wins");
        System.out.println("       -->      Between Scissors and Rock: Rock Wins");
        if (x == 1 && y == 3) {
            System.out.println("You wins");
        } else if (x == 3 && y == 1) {
            System.out.println("Computer wins");
        } else if (x < y) {
            System.out.println("Computer wins");
        } else if (x == y) {
            System.out.println("Match Tie");
        } else {
            System.out.println("You Wins");
        }
    }


    public static void main(String args[]){
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your Full Name: ");
            String Name = sc.nextLine();
            System.out.println("");
            System.out.println(Name + " , Welcome ! to the Game Rock Paper And Scissors");
            System.out.println("");
            System.out.println("");
    
            System.out.println("Choose between the following: ");
            System.out.println("Press 1 for Rock");
            System.out.println("Press 2 for Paper");
            System.out.println("Press 3 for Scissors");
            System.out.println(" ");
            System.out.print("Enter your choice 1,2 or 3: ");
            int choice = sc.nextInt();
            if (choice > 3) {
                System.out.println("You have entered Wrong Option, Thank you");
            } else {
                UserChoice(choice, Name);

                Random rand = new Random();
                int m1 = rand.nextInt(4);
                if (m1 == 1) {
                    System.out.println("Computer Choose: Rock");
                } else if (m1 == 2) {
                    System.out.println("Computer Choose: Paper");
                } else if (m1 == 3) {
                    System.out.println("Computer Choose: Scissors");
                }
                
                
                Winner(choice, m1);
    
            }
            System.out.println("Do You want to Play Again:Press 1 for Yes and For Exist, Press Any Number: ");
    
            count = sc.nextInt();
            if(count >=2){
                System.out.println("You Have Sucessfully Exist,Thankyou");
            }
        }while(count==1);
        
    }
}