//reverse no.of given no.

import java.util.*;
class ReverseNumber{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Number");
	 int num = sc.nextInt();
	 
	 int i;
	 for(i = 0;num!=0;i++){
	 int a= num%10;
	 num = num/10;
	 
	 System.out.println(a);
	 }
	 }
	} 
	 