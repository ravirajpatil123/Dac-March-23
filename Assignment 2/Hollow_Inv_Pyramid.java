class Hollow_Inv_Pyramid{
  public static void main(String args[]){
  

         for(int i=6;i>=1;i--)
		 {
             for(int j=1;j>=i;j++)
			 {
				 if((i==1) || (j==1) || (j==7))
				 {
				 System.out.print("* ");
				 }
				 else
				 {
					System.out.print(""); 
				 }	 
			 }
			 

             System.out.println();

		 }

		} 
}