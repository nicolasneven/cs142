public class ArrayExample {
   public static void main(String[] args) {
      // int bro = 32;
      // int me = 30;
      // int sis1 = 27;
      // int sis2 = 23;
      
      int[] siblingAges = new int[4];
      siblingAges[0] = 32;
      siblingAges[1] = 30;
      siblingAges[2] = 27;
      siblingAges[3] = 23;
      
      printAges("Brand", siblingAges);
   }
   
   public static void printAges(String familyName, int[] siblingAges) {
      for (int i = 0; i < siblingAges.length; i++) {
         System.out.println("Sibling #" + i + " in the " + familyName + " family is "
                              + siblingAges[i] + " years old.");
      }
   } 
}