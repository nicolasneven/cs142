//Nico Neven
//10/2/17
//CSE 142 BN
//TA: Alex Edward Smintina
//Assignment #1
//
//This program will produce a cumulative song ("There was an old lady who swallowed a fly")
//in which successive verses build on previous verses using static methods and println statements

public class Song {
   public static void main(String[] args) {
      verse1();
      verse2();
      verse3();
      verse4();
      verse5();
      verse6();
      verse7();
   }
   
   //Prints the last 2 lines of the song "chorus"
   public static void fly() {
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
      System.out.println("");
   }
   
   //Prints the spiderFly line while accumulating the fly method/lines
   public static void spiderFly() {
      System.out.println("She swallowed the spider to catch the fly,");
      fly();
   }
   
   //Prints the birdSpider line while accumulating the spiderFly method/lines
   public static void birdSpider() {
      System.out.println("She swallowed the bird to catch the spider,");
      spiderFly();
   }
   
   //Prints the catBird line while accumulating the birdSpider method/lines
   public static void catBird() {
      System.out.println("She swallowed the cat to catch the bird,");
      birdSpider();
   }
   
   //Prints the dogCat line while accumulating the catBird method/lines
   public static void dogCat() {
      System.out.println("She swallowed the dog to catch the cat,");
      catBird();
   }
   
   //Prints the bearDog line while accumulating the dogCat method/lines
   public static void bearDog() {
      System.out.println("She swallowed the bear to catch the dog,");
      dogCat();
   }
   
   //Prints the first verse that gets called in the main method
   public static void verse1() {
      System.out.println("There was an old woman who swallowed a fly.");
      fly();
   }
   
   //Prints the second verse that gets called in the main method
   public static void verse2() {
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      spiderFly();
   }
   
   //Prints the third verse that gets called in the main method
   public static void verse3() {
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      birdSpider();
   }
   
   //Prints the fourth verse that gets called in the main method
   public static void verse4() {
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      catBird();
   }
   
   //Prints the fifth verse that gets called in the main method
   public static void verse5() {
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      dogCat();
   }
   
   //Prints the sixth verse that gets called in the main method
   public static void verse6() {
      System.out.println("There was an old woman who swallowed a bear,");
      System.out.println("How unfair to swallow that bear.");
      bearDog();
   }
   
   //Prints the seventh verse that gets called in the main method
   public static void verse7() {
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
   }
}