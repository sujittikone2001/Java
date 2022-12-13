import java.util.Scanner;
public JaggedArrayAssignment Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
      
        int m;
        System.out.println("Enter the number of rows for jagged arrays\n");
        m=sc.nextInt();     
        
        int arr[][] = new int[m][];
        
        System.out.println("Enter the number of columns for each rows of jagged arrays\n");
        for(int i=0;i<m;i++)
        {
            arr[i]=new int[sc.nextInt()];
        }

        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++)   
        {
            for (int j = 0; j < arr[i].length; j++)   
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++)     
        {
            for (int j = 0; j < arr[i].length; j++)    
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}