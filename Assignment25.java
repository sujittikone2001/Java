import java.util.Scanner;
public class AverageArrays {
   public static void main(String args[]){


      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elements\n");
      int num = sc.nextInt();

      int[] myArray = new int[num];

      for(int i =0; i<num; i++){
         myArray[i] = sc.nextInt();
      }
      int average = 0;
      for(int i =0; i<num; i++){
         average = average + myArray[i];
      }
       average = average/num;
      System.out.println("Average of given numbers :: "+average);
   }
}