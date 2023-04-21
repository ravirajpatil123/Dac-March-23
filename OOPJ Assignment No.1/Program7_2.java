//short into short instance
class Program7_2{
    public static void main(String args[])
    {
        short b1 = 12;
      // Short sh= new Short(b1);
        short str = Short.valueOf(b1);
        System.out.println("short into short instance :"+ str );
    }
}