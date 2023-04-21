//inconert long instance into byte,short,int,long,float,double
class Program24{
    static Double b1=10.5;
    public static void main(String[] args)
     {
        Double b3 = new Double(b1);

        byte b4 = b3.byteValue();
        System.out.println("double to Byte Conversion :"+b4);
        System.out.println();
        
        
        short s = b3.shortValue();
        System.out.println("double to Short Conversion :"+s);
        System.out.println();
        

        int i = b3.intValue(); 
        System.out.println("double To Integer Conversion :"+i);
        System.out.println();
        

        long l =b3.longValue();
        System.out.println("double to Long Conversion :"+l);
        System.out.println();
        

        float f= b3.floatValue();
        System.out.println("double to float Conversion :"+f);
        System.out.println();
        

        double d = b3.doubleValue();
        System.out.println("double to Double Conversion :"+d);
    }   
}