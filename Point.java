public class Point {
   int x;
   int y;
   
   public double distanceFromOrigin() {
      return Math.sqrt(x * x + y * y); 
   }
}