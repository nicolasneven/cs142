public class PointClient {
   public static void main(String[] args) {
      Point p1 = new Point();
      Point p2 = new Point();
      point p3 = new Point();
      
      p1.x = 3;
      p1.y = 4;
      
      p2.x = 4;
      p2.y = 18;
      
      System.out.println("P1 Distance From Origin: " + p1.distanceFromOrigin());
      System.out.println("P2 Distance From Origin: " + p2.distanceFromOrigin());
   }
}