//inconert long instance into byte,short,int,long,float,double
class Program15{
    static Long b1=10l;
    public static void main(String[] args)
     {
        Long b3 = new Long(b1);

        byte b4 = b3.byteValue();
        System.out.println("long to Byte Conversion :"+b4);
        System.out.println();
        
        
        short s = b3.shortValue();
        System.out.println("long to Short Conversion :"+s);
        System.out.println();
        

        int i = b3.intValue(); 
        System.out.println("long To Integer Conversion :"+i);
        System.out.println();
    

        long l =b3.longValue();
        System.out.println("long to Long Conversion :"+l);
        System.out.println();
        

        float f= b3.floatValue();
        System.out.println("long to float Conversion :"+f);
        System.out.println();
    

        double d = b3.doubleValue();
        System.out.println("long to Double Conversion :"+d);
        
    }   
}