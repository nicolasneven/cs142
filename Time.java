public class Time {
   public static void main(String[] args) {
      long millis = System.currentTimeMillis(); 
      long days = millisToDays(millis);
      long weeks = days / 7;
      
      System.out.println("CUREENT TIME IN MILLIS: " + millis);
      System.out.println("IN DAYS, THAT IS: " + days);
      System.out.println("IN WEEKS, THAT IS: " + weeks);
   }
   
   public static long millisToDays(long millis) {
      long days = millis / 1000 / 60 / 60 / 24;
      return days;
      // number of millis since Jan, 1 1970
      // expression
      // millis /1000 = seconds
      // seconds / 60 = minutes
      // minutes / 60 = hours
      // hours / 24 = days
   }
}