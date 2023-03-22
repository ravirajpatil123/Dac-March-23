class Pattern18{
    public static void main(String args[]){
	   int alpha=70;
for(int i=1;i<=5;i++){
	
		for(int j=5;j>=i;j--){
			System.out.print((char)(alpha-j)+" ");

		}
		
	System.out.println();
}
}
}

/*o/p

A B C D E
A B C D
A B C
A B
A

*/