class Pattern13{
  public static void main(String args[]){
  
char sp;
         for( char i =65;i<70;i++)
		 {
             for(sp=70;sp>=i;sp--)
			 {
				 System.out.print(" ");
				 
			 }
			
			 for(char j=65;j<=i;j++)
			 {
				// System.out.print(" ");  
				 System.out.print(i+" ");
				
			 }
             System.out.println();

		 }

		} 
		}
/* o/p		
      A
     B B
    C C C
   D D D D
  E E E E E		