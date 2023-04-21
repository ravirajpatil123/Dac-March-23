//a.Double into string
class Program23{
    public static void main(String args[]){
       Double n1=12.3f;
        String str = Double.toString(n1);
        System.out.println("double to string:"+str);
    

//b.double to double instance
Double n2=11.5f;
Double num=Double.valueOf(n2);
System.out.println("double to double instance:"+num);
    

//c.string istance to double instance
String s1="123";
String st = new String(s1);
Double int1= Double.valueOf(st);
System.out.println("string istance to double instance:"+st);
    

//d.conversion
double num1 = 15.3;
long bits = Double.doubleToLongBits(num1);
String binary = Long.toBinaryString(num1);
System.out.println("binary no:"+binary);
long bits = Double.doubleToLongBits(num1);
String octal = Long.toOctalString(num1);
System.out.println("Octal no:"+octal);
long bits = Double.doubleToLongBits(num1);
String hex = Long.toHexString(num1);
System.out.println("hexadecimal no:"+hex);


    }
}

/*
double num = 3.14159;
long bits = Double.doubleToLongBits(num);
String binary = Long.toBinaryString(bits);
System.out.println(binary);


*/
