class Pattern2{
   public static void main(String args[])
   {
      for(char i =65;i<70;i++)
	  {
	     for(char j =65;j<=i;j++)
		 {
		 System.out.print(j +" ");
		 }
		  System.out.println();
		}
}
}		
/*o/p
A
A B
A B C
A B C D
A B C D E


class Pattern{
	public static void main(String args[]){
		for(char ch='A';ch<='E';ch++)
		{
			for(char c='A';c<=ch;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
	
}