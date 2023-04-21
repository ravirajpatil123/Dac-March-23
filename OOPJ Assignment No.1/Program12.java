//a.int to string
class Program12{
    public static void main(String args[]){
       int n1=123;
        String str = Integer.toString(n1);
        System.out.println("int to string:"+str);
    

//b.int to int instance
int n2=12;
Integer num=Integer.valueOf(n2);
System.out.println("int to int instance:"+num);
    

//c.string istance to int instance
String s1="123";
String st = new String(s1);
Integer int1= Integer.valueOf(st);
System.out.println("string istance to int instance:"+st);
    

//d.conversion
int num1 = 13;
String binary = Integer.toBinaryString(num1);
System.out.println("binary no:"+binary);
String octal = Integer.toOctalString(num);
System.out.println("Octal no:"+octal);
String hex = Integer.toHexString(num);
System.out.println("hexadecimal no:"+hex);


    }
}






