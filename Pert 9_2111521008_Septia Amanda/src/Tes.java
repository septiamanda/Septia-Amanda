class Parent 
{
    int x = 5;
    public void info()
    {
        System.out.println("ini class parent");
    }
}

class child extends Parent 
{
    int x = 10;
    public void info()
    {
        System.out.println("ini class child");
    }
}
public class Tes 
{
    public static void main (String args[]) 
    {
        Parent tes = new child();
        System.out.println("Nilai x = " + tes.x);
        tes.info();
    }
}