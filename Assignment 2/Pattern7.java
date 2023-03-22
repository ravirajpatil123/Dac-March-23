class Pattern7{
  public static void main(String args[]){
  
int sp;
         for(int i=1;i<=5;i++)
		 {
             for(sp=5;sp>=i;sp--)
			 {
				 System.out.print(" ");
				 
			 }
			 
			 for(int j=1;j<=i;j++)
			 {
				// System.out.print(" ");  
				 System.out.print(j+" ");
				
			 }
             System.out.println();

		 }

		} 
		}
		
/*o/p		
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5