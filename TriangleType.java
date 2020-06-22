public class TriangleType {
	public static void main (String args[]) {
		printTriangleType(5,7,7);
		printTriangleType(6,6,6);
		printTriangleType(5,7,8);
		printTriangleType(2,18,2);

	}
	
	public static void printTriangleType(int a , int b, int c) {
   
		//equilateral
		if (a == b && a == c) {
			System.out.println("equilateral");
		}
		//isosceles
		else if ( (a == b && b != c) 
		       || (a == c && c != b) 
		       || (b == c && a != c)) {
			System.out.println("isosceles");
		}
		//scalene
		else {
			System.out.println("scalene");
		}
	}
}