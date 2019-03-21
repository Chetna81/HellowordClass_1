public class Marksheet
{
    static void addition (int a, int b, int c)
    {
        System .out.println(" student 1");
        System.out.println(" total = " + (a + b + c));
        System.out.println(" percentage = " + ( a + b + c) * 100 / 300);

    }
    static void addition1 ( int x, int y, int z)
    {
        System.out.println(" student 2");
        System.out.println(" percentage =" + (x + y + z) * 100 / 300);
    }
    public static void main (String [] args)
    {
        addition( 45, 68, 90);
        addition1( 75, 80, 65 );
    }



}
