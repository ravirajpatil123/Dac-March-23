import java.util.Scanner;

class Actor{
	String name;
	String address;
	int age;
	String dob;
	int no_of_movies;
	int no_of_awards;
	String mob_no;
	
	void get_info()
	{
		System.out.println("information About an actor:");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		address=sc.nextLine();
		age=sc.nextInt();
		dob=sc.next();
		no_of_movies=sc.nextInt();
		no_of_awards=sc.nextInt();
		mob_no=sc.next();
		
		
		
	}
	void display_info()
	{
		System.out.println("name="+name);
		System.out.println("address="+address);
		System.out.println("age="+age);
		System.out.println("dob="+dob);
		System.out.println("no_of_movies="+no_of_movies);
		System.out.println("no_of_awards="+no_of_awards);
		System.out.println("mob_no="+mob_no);
	}
	
	public static void main(String args[]){
		
		
		Actor A1=new Actor();
		A1.get_info();
		A1.display_info();
		
		
	}
	
}