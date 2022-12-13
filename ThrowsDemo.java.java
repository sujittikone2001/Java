class Arithmetic
{
  public in Division(int A, int B) throws ArithmeticException
  {
     int Ans = 0;
     Ans = A / B;
     return Ans;
  }
}

class ThrowsDemo
{
  public static void main(String a[])
  {
     Scanner sobj = new Scanner(System.in);
     System.out.println("Enter first number");
     int iNo1 = sobj.nextInt();
     System.out.println("Enter second number");
     int iNo2 = sobj.nextInt();

     Arithmetic aobj = new Arithmetic();

     try
      {
        int Ret = aobj.Division(iNo1,iNo2);
        System.out.println("Division is : "+Ret);
      }
      catch(Arithmetic obj)
      {
        System.out.println("Exception Occured");
        System.out.println(obj);
      }
  }
}