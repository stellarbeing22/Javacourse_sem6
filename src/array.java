import java.util.Scanner;

public class array {
    public static void main(String[] args)
    {

        Scanner data = new Scanner(System.in);

        //int size = 3;
        //int array[] = new int[size];

        int row, column;

        System.out.println("Enter row size");
        row = data.nextInt();
        System.out.println("Enter column size");
        column = data.nextInt();
        int matrix[][] = new int[row][column];


        /*
        for(int i = 0; i < size; i++)
        {
            System.out.println("Enter the marks: ");
            int marks = data.nextInt();
            array[i] = marks;
        }
        */

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                matrix[i][j] =  data.nextInt();
            }
        }

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.print("\n");
        }

        /*
        for(int i = 0; i < size; i++)
        {
            System.out.println(array[i]);
        }
        */

        /*
        //for each loop 
        for(int i: array)
        {
            System.out.println(array[i]);
        }
        */
        data.close();
    }
}

