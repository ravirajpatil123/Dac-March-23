import java.util.Scanner;
class ArrMinMax{
	
	public static void main(String [] args){
		
		int[] arr= new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			//Scanner sc = new Scanner(System.in);
			System.out.println("Enter "+ i +" Array Element :");
			arr[i]= sc.nextInt();
	    }
		        
		int max=arr[0];     
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(max<arr[i+1])
			   max= arr[i+1];
		   
		   
			//System.out.println(arr[i]);
	    }
		System.out.println("Maximum Elements is: "+ max);
		
		
		
		
		
		 int min=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			if(min>arr[i+1])
			   min= arr[i+1];
		   	
	    }
		System.out.println("Minimum Elements is: "+ min);
	}
}