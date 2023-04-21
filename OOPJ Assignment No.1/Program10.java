//inconert short instance into byte,short,int,long,float,double
class Program10{
    static short s1=10;
    public static void main(String[] args)
     {
        Short s3 = new Short(s1);

        byte b4 = s3.byteValue();
        System.out.println("short to Byte Conversion :"+b4);
        System.out.println();
        // Byte instance to Byte.
        
        short s = s3.shortValue();
        System.out.println("short to Short Conversion :"+s);
        System.out.println();
        // Byte instance to Short.

        int i = s3.intValue(); 
        System.out.println("short To Integer Conversion :"+i);
        System.out.println();
        // Byte instance to integer

        long l =s3.longValue();
        System.out.println("short to Long Conversion :"+l);
        System.out.println();
        // Byte to long conversion.

        float f= s3.floatValue();
        System.out.println("short to float Conversion :"+f);
        System.out.println();
        // Byte to float Conversion

        double d = s3.doubleValue();
        System.out.println("short to Double Conversion :"+d);
        //Byte instance to double conversion.
    }   
}