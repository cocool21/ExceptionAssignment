import java.util.Scanner;
 
public class ExceptionAssignment {
  public static void main(String[] args) {
 
  int a, b, result;
 
  Scanner input = new Scanner(System.in);
  System.out.println("Input two integers");
 
  a = input.nextInt();
  b = input.nextInt();
  result=12;
 try{
  result = a / b;
 
  System.out.println("Result = " + result);
 }catch(ArithmeticException e){
	 System.out.println("Divisor cannot be zero!");
 }
 finally {
	    System.out.println("finally block will execute.");
	    System.out.println(result);
	}
 }
}
