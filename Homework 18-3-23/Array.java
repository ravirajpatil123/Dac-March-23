import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter array element:"+i);
			arr[i] = sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println("array elements is:");
			System.out.println(arr[i]+" ");
			
		}
	}
}
/*o/p


----------OR---------



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
}

class Array1D{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Declare Array Size");
		int arr[]=new int[sc.nextInt()];
		
		Array a=new Array();
		
		a.get_Array(arr);
		a.display_Array(arr);
	}
}

*/