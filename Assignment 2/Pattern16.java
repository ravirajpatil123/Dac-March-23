class Pattern16{
  public static void main(String args[]){


       for(int i=5; i>=1; i--)
		 {
			for(int k=5; k>=i; k--){
			  // System.out.print(" ");
			}

				for(int j=5; j>=i; j--)
			  {
				System.out.print(" "+j);
		      }
			    System.out.println();
		}
		
}		
}
/* o/p
 5
 5 4
 5 4 3
 5 4 3 2
 5 4 3 2 1