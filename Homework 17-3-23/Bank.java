import java.util.Scanner ;
class Bank{
   String accno ;
   String name  ; 
   String mob_no ;
   int age ; 
   String balance ;
   
   void first()
   {
     Scanner sc = new Scanner(System.in) ;
	 System.out.println("Enter Account no : ") ; 
	    accno = sc.next() ; 
		System.out.println("Enter your name : ") ; 
		name = sc.next() ; 
		System.out.println("Enter your mob_no : ") ; 
		mob_no = sc.next(); 
		System.out.println("Enter your  age : ") ; 
		age = sc.nextInt() ;
		System.out.println("Enter your  Balance: ") ; 
		balance = sc.next() ;
		
   } 
   
   void display(){
   
    System.out.println(" Your acc_no = " + accno);
	System.out.println(" Your Name = " + name);
	System.out.println(" Your Mobile no = " + mob_no);
	System.out.println(" Your age = " + age);
	System.out.println(" Your Balance = " + balance);
	
   
   
   
   
   }
   public static void main(String args[]) {
     System.out.println("Enter first customer details : ") ; 
     Bank b1 = new Bank () ;
	 b1.first() ;
	 
	 System.out.println("Enter second customer details : ") ; 
	 Bank b2 = new Bank() ;
	 b2.first() ;
	 System.out.println("First customer details : ") ; 
	 b1.display() ;
	 System.out.println("Second customer details : ") ; 
	 b2.display() ;
	 
	 
	 
   }

}
