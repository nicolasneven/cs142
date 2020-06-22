import java.util.*;
public class DeathBattle {
   public static void main(String[] args) {
   
      battleToTheDeath(1, 10);
   }
   
   public static void battleToTheDeath(int one, int two) {
   
      System.out.println("DEATH MATCH!!!");
      
      Random random = new Random();
      int healthOne = 100;
      int healthTwo = 100;
      
      while (healthOne > 0 && healthTwo > 0) {
         
         int damageOne = random.nextInt(two-one) + one;
         System.out.println("Player 2 attacks! " + (-damageOne) + " damage");
         healthOne = healthOne - damageOne;
         int damageTwo = random.nextInt(two-one) + one;
         System.out.println("Player 1 attacks! " + (-damageTwo) + " damage");
         healthTwo = healthTwo - damageTwo;
         if (healthOne > 0 && healthTwo <= 0) {
            System.out.println("Player 1 Wins!");
         } if (healthTwo > 0 && healthOne <= 0) {
            System.out.println("Player 2 Wins!");
         }
      }
   }
} 