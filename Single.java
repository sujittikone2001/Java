class Single
{
   public static void main(String arg[])
   {
      //Base bobj1 = new Base();
      //Derived dobj1 = new Derived();
      Base bobj2 = new Derived();
      // Derived dobj2 = new Base();

      dobj2.fun();
      dobj2.fun(11);
      dobj2.gun();
     // dobj2.sun();
   }
}
class Base
{
   public int A,B;
   public Base()
   {
     System.out.println("Base Constructor");
     this.A = 10;
     this.B = 20;
   }
   public void fun()
   {
     System.out.println("Inside Base fun");
   }
   public void gun()
   {
     System.out.println("Inside Base gun");
   }
   public void fun(int iNo)
   {
     System.out.println("Inside Base fun with the on e Integer");
   }
}

class Derived extends Base
{
   public int X,Y;
   public Derived()
   {
     System.out.println("Derived constructor");
     this.X = 30;
     this.Y = 40;
   }
   public void sun()
   {
     System.out.println("Inside Derived sun");
   }
   public void gun()
   {
     System.out.println("Inside Derived gun");
   }
}

