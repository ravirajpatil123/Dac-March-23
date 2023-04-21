class Program17_3{
    public static void main(String args[])
    {
        long num = 123l;
String binary = Long.toBinaryString(num);
System.out.println("binary no:"+binary);
String octal = Long.toOctalString(num);
System.out.println("Octal no:"+octal);
String hex = Long.toHexString(num);
System.out.println("hexadecimal no:"+hex);

    }
}


