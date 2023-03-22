import java.util.Scanner;
class Radio
{   
    String channel_name;
	String founder_name;
    int yr_of_istablishment;

	
	void get_info()
	{ 
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Info.about radio channel");
	  channel_name = sc.next();
	  founder_name = sc.next();
	  yr_of_istablishment = sc.nextInt();
	 
	}
	
	void display_info()
	{
		System.out.println("channel name is:"+channel_name);
		System.out.println("Founder name is:"+founder_name);
		System.out.println("year of istablishment is:"+yr_of_istablishment);
	}
	public static void main(String args[])
	{
		Radio r1 = new Radio();
		r1.get_info();
		r1.display_info();
	}
}