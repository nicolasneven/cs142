public class ParameterMystery {
   public static void main(String[] args) {
   
      String four = "2";
      String hey = "hello";
      String hello = "hey";
      
      mystery("1", four, "3");
      mystery(hey, hey, hello);
   }
   
   public static void mystery(String one, String two, String three) {
      
      System.out.println(one + " " + two + " " + three);
   }
}