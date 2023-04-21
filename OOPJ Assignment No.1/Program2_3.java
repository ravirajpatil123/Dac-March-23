//string to boolean
class Program2_3{
    public static void main(String args[]){
      /*  String str = "True";
        Boolean b1=Boolean.valueOf(str);
        System.out.println("Boolean :"+b1);
    */
    String sc=new String("true");
    boolean b= Boolean.parseBoolean(sc);
    System.out.println("Boolean :"+b);
    }

}
//Boolean :true