package Overriding;

class Super
{
    public void display()
    {
        System.out.println("Super class display");
    }
}
class Sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("Sub class display");
    }
}

public class Overriding {

    public static void main(String[] args) {
        Super sup = new Sub();// Call method based upon object
        sup.display();
    }
    
}
