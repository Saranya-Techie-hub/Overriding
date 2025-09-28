
package Overriding;

class Car
{
 public void start()
 {
     System.out.println("Car Started");
 }
 public void accelerate()
 {
     System.out.println("Car is accelerated");
 }
 public void changeGear()
 {
     System.out.println("Car gear is changed");
 }
}
class LuxuryCar extends Car
{
    @Override
   public void changeGear()
   {
       System.out.println("Automatic gear");
   }
   public void openRoof()
   {
       System.out.println("Sun roof is opened");
   }
}
public class Overriding2 {

    public static void main(String[] args) {
        Car c = new LuxuryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        //c.openRoof();
    }
    
}
