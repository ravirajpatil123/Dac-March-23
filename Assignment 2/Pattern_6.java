class Pattern_6{
   public static void main(String args[])
   {
      for(int i =5 ; i>=1 ; i--){
	   for(int j= 4 ; j>=i ; j--){
		    System.out.print(" ");
	   }
	   for(int k=1 ; k<=i ; k++){
	      System.out.print("*");
	   }
	   
	   for(int j = 1 ; j<i ; j++){
			  System.out.print("*") ;
			  
		  }
	   System.out.println();
   }
  }

}
/* o/p
*********
 *******
  *****
   ***
    *

*/