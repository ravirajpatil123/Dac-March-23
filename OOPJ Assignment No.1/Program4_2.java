//string instance into byte instance
class Program4_2{
    public static void main(String args[]){
        
       String str = new String("123");
       byte b1 = Byte.valueOf(str);

       System.out.println("String instance to byte instance:"+b1);
}
}
