//inconert float instance into byte,short,int,long,float,double
class Program20{
    static Short b1=103;
    public static void main(String[] args)
     {
        Short b3 = new Short(b1);

        byte b4 = b3.byteValue();
        System.out.println("float to Byte Conversion :"+b4);
        System.out.println();
        
        
        short s = b3.shortValue();
        System.out.println("float to Short Conversion :"+s);
        System.out.println();
        

        int i = b3.intValue(); 
        System.out.println("floatTo Integer Conversion :"+i);
        System.out.println();
        

        long l =b3.longValue();
        System.out.println("float to Long Conversion :"+l);
        System.out.println();
        

        float f= b3.floatValue();
        System.out.println("float to float Conversion :"+f);
        System.out.println();
        

        double d = b3.doubleValue();
        System.out.println("float to Double Conversion :"+d);
    }   
}