class pyr4{
public static void main(String args[]){
/*-------------------------------------------	
						1
					   121
					  12321
					 1234321
					123454321
				   12345654321
				  1234567654321
				 123456787654321
				12345678987654321													
--------------------------------------------*/	
 for(int i=1;i<=9;i++){
	 for(int k=8;k>=i;k--){
	System.out.print(" ");
	 }
	for(int j=1;j<=i;j++){
		System.out.print(j+"");	
	}	

	for(int l=i-1;l>=1;l--){
		
	System.out.print(l+"");	
	}
	System.out.println();	 
 }
}
}