import java.util.Scanner;

class Array{
	Scanner sc=new Scanner(System.in);
	
	void get_Array(int[] arr)
	{
		System.out.println("Enter Array Elements");
		
	     for(int i=0; i<arr.length; i++){
			 arr[i]=sc.nextInt();
			  }
	}
	
	
	void display_Array(int[] arr)
    {
		System.out.println("Array Elements are");
		
	     for(int i=0; i<arr.length; i++){
			 System.out.print(arr[i]+" ");
			  }
	}
	
	void identify(int[] arr)
    {
		System.out.println("identify any element present or not");
		int x = sc.nextInt();
		
	     for(int i=0; i<arr.length; i++)
		{
			if(x == arr[i]) 
			{	
			System.out.println("element present in array");
			break;
			}
			
			else
			{	
			System.out.println("element not  present in array");
			break;
			
			}
			
		}
	}
}

class Array1{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Declare Array Size");
		int arr[]=new int[sc.nextInt()];
		
		Array a=new Array();
		
		a.get_Array(arr);
		a.display_Array(arr);
		a.identify(arr);
		
	}
}