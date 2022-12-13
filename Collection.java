import java.util.*;

class Collection
{
   public static void main(String arg[])
   {
      LinkedList <Integer>lobj = new LinkedList<Integer>();

      lobj.add(11);
      lobj.add(21);
      lobj.add(51);
      lobj.add(101);
      lobj.add(111);

      System.out.println("Elements of linkedlist are : "+ lobj);

      lobj.addFirst(1);
      
      System.out.println("Elements of linkedlist are : "+ lobj);

      lobj.addLast(121);
      System.out.println("Elements of linkedlist are : "+ lobj);

      Iterator iobj = lobj.iterator();
      System.out.println("Data using Iterator : ");
      while(iobj.hasNext())
      {
        System.out.println(iobj.next());
      }
      if(lobj.contains(121))
      {
        System.out.println("121 present in LL");
      }
      else
      {
        System.out.println("121 present in LL");
      }

      lobj.remove();
      System.out.println("Elements of linkedlist are : "+ lobj);

      lobj.remove(0);
      System.out.println("Elements of linkedlist are : "+ lobj);

      lobj.removeLast();
      System.out.println("Elements of linkedlist are : "+ lobj);

      System.out.println("number of Elements in linkedlist are : "+ lobj.size());

      lobj.set(1,210);
      System.out.println("Elements of linkedlist are : "+ lobj);

      lobj.clear();
      System.out.println("Elements of linkedlist are : "+ lobj);
   }
}