import p2.ArithmeticOps;
import p2.Addition;
public class TestApp {
 public static void main(String args[]) {
	 
	 //Approach 1 Implementing in a Class
	 ArithmeticOps add=new Addition();
	 System.out.println(add.calculate(12,12));
	 
	 //Approach 2 Anonymous inner class
	 
	 ArithmeticOps sub= new ArithmeticOps() {
		 public int calculate(int a,int b) {
			 return a-b;
		 }
	 };
	// System.out.println(sub.calculate(21, 21));
	 
	 //Approach 3 LambdaExpression
	 ArithmeticOps mul=(a,b)->a*b;
	 System.out.println(mul.calculate(12, 12));
	 
 }
}
