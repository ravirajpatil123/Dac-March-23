//swap two numbers without using third no.
 import java.util.*;
 
 class Swap{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	a= a+b;
	b= a-b;  //b=(a+b)-b
	a= a-b;  //a=(a+b)-b
	
	System.out.println(a);
	System.out.println(b);
	}
}
		
	