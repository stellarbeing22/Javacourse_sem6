import java.util.Scanner;

public class controlFlow {
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter your first number");
        int val1 = number.nextInt();

        System.out.println("Enter your second number");
        int val2 = number.nextInt();

        System.out.println("Enter your third number");
        int val3 = number.nextInt();
        
        //Quesrion: take 3 int and print the greatest one

        if(val1>= val2 && val1>=val3)
            System.out.println(val1);
        else if(val2>=val1 && val2>=val3)
            System.out.println(val2);
        else
            System.out.println(val3);
        
        // if(val%2 == 0)
        //     System.out.println("Number is even");
        // else
        //     System.out.println("Number is odd");

        // System.out.println((val%2 == 0)?"Number is even":"number is even");
        number.close();

        int choice;

        System.out.println("Enter your choice");
        choice = number.nextInt();

        switch (choice) {
            case 1:
            System.out.println("1");
                break;
        
            default:
                break;
        }
    }
}
