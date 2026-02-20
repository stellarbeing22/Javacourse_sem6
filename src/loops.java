import java.util.Scanner;

public class loops {
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter the number");
        int val = number.nextInt();

        if(val < 0)
        {
            System.out.println("not prime");
            number.close();
            return;
        }else
        {
            for(int i = 2; i < val; i++)
            {
                if(val%i == 0)
                {
                    System.out.println("Not prime");
                    number.close();
                    return;
                }
            }
        }
        
         number.close();
    }
}
