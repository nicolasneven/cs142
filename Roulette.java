import java.util.*;
public class Roulette {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      Random random = new Random();
      int money = 1000;
      
      System.out.println("Welcome to Roulette!");
      
      while( money > 0 ) {
         
         System.out.println("You have $" + money);
         System.out.print("How much money would you like to bet? ");
         int bet = console.nextInt();
         while (bet > money) {
            System.out.println("Your bet was too big. You have " + money + ".");
            System.out.print("How much would you like to bet? ");
            bet = console.nextInt();
         }
         
         money -= bet;
         
         System.out.println("Your guess? (0-36) ");
         int guess = console.nextInt();
         int roll = random.nextInt(37);
         if (guess == roll) {
            money += bet * 35;
         }         
      }
   }
}