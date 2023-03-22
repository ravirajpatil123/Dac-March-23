class Area1
{
	float r=5;
	float s=12;
	float h=12;
    float b=10;
	
	
	void cal_circle()
   {
	   System.out.println("area of circle = "+(3.14*r*r));
   }
   
   void cal_tri()
   {
	   System.out.println("area of Triangle = "+(0.5*b*h));
   }
   void cal_Squ()
   {
	   System.out.println("area of square = "+(s*s));
   }
   void cal_react()
   {
	   System.out.println("area of reactangle = "+(h*b));
   }
	
	public static void main(String args[])
	{
		System.out.println("Area");
		Area1 c1=new Area1();
		c1.cal_circle();
		c1.cal_tri();
		c1.cal_Squ();
		c1.cal_react();
		
	
		
	}
	
	
	
	
	
}
/* o/p

Area
area of circle = 78.5
area of Triangle = 60.0
area of square = 144.0
area of reactangle = 120.0

*/