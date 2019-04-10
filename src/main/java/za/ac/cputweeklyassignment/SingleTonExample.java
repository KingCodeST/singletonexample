package za.ac.cputweeklyassignment;

public class SingleTonExample {

    private static SingleTonExample singleTonExample =null;

    private SingleTonExample()
    {

    }

    public static SingleTonExample getInstance()
    {
        if(singleTonExample ==null)
        {
            singleTonExample =new SingleTonExample();
        }
        return singleTonExample;

    }

    public void sayHello()
    {
        System.out.println("Hello");
    }



}
