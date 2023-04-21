class Program17{
    public static void main(String args[])
    {
        long a=20l;
        Long m=new Long(a);
        String st =m.toString();
        System.out.println("long to string:"+st);


        Long n=Long.valueOf(a);
       System.out.println("long to long instance:"+n);


    }
}
