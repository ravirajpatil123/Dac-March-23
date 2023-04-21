//a.float into string
class Program21{
    public static void main(String args[]){
       Float n1=12.3f;
        String str = Float.toString(n1);
        System.out.println("float to string:"+str);
    

//b.float to float instance
float n2=11.5f;
Float num=Float.valueOf(n2);
System.out.println("Float to float instance:"+num);
    

//c.string istance to float instance
String s1="123";
String st = new String(s1);
Float int1= Float.valueOf(st);
System.out.println("string istance to Float instance:"+st);
    

//d.conversion
float num1 = 15.3f;
String binary = Float.toBinaryString(num1);
System.out.println("binary no:"+binary);
String octal = Float.toOctalString(num1);
System.out.println("Octal no:"+octal);
String hex = Float.toHexString(num1);
System.out.println("hexadecimal no:"+hex);


    }
}






