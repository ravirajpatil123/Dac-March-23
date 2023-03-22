import java.util.Scanner;
class Cake{
	int order_no;
    String shape; 
	String colour;
	float weight;
	String flavour;
	String name_on_cake;
	
	void accept_order()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your order details :");
		System.out.println("enter your order no :");
		order_no = sc.nextInt();
		System.out.println("enter shape you want:");
		shape = sc.next();
		System.out.println("enter colour you want :");
		colour =sc.next();
		System.out.println("enter weight of cake :"); 
		weight = sc.nextFloat();
		System.out.println("enter flavour of cake :");
		flavour = sc.next();
		System.out.println("enter name you want on cake :");
		name_on_cake = sc.next();
		
		
	}
	
	void display_order()
	{
		System.out.println("order no is :"+(order_no));
		System.out.println("shape  is :"+(shape));
		System.out.println(" colour is  is :"+(colour));
		System.out.println("weight  is :"+(weight));
		System.out.println("flavour is :"+(flavour));
		System.out.println("your name on is :"+(name_on_cake));
	}
	
	
	public static void main(String args[])
	{
		Cake c1 = new Cake();
		c1.accept_order();
		c1.display_order();
		
	}
}	