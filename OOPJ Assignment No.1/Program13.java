        //convert integer instance into byte,short,int,long,float,double
class Program13{
    static Integer b1=10;
    public static void main(String[] args)
     {
        Integer b3 = new Integer(b1);

        byte b4 = b3.byteValue();
        System.out.println("int to Byte Conversion :"+b4);
        System.out.println();
        
        
        short s = b3.shortValue();
        System.out.println("int to Short Conversion :"+s);
        System.out.println();
    

        int i = b3.intValue(); 
        System.out.println("int To Integer Conversion :"+i);
        System.out.println();


        long l =b3.longValue();
        System.out.println("int to Long Conversion :"+l);
        System.out.println();
        

        float f= b3.floatValue();
        System.out.println("int to float Conversion :"+f);
        System.out.println();
        

        double d = b3.doubleValue();
        System.out.println("int to Double Conversion :"+d);
        
    }   
}
    
