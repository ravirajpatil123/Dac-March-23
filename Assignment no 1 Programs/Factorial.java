//Fcatorial of given no.

import java.util.*;

class Factorial{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no.");
	int num = sc.nextInt();
	
	int sum = 1;
	for(int i = num; i>1;i--){
	sum = sum*i;
	}
	System.out.println("Fcatorail is = "+ sum);
	}
}	