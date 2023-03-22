//check given no.is positive or negative.

import java.util.*;
 
 class PositiveNegative{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int num = sc.nextInt();
	
	if (num>0)
	{
	  System.out.println("number is positive");
	  }
	  else if(num<0)
	  {
	  System.out.println("Number is negative");
	  }
	  else{
		 System.out.println(" ");  
	 }
	}
 }