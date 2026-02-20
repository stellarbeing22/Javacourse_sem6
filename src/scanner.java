import java.util.Scanner;

public class scanner {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");
        int number = sc.nextInt();

        System.out.println("Enter a char");
        char character = sc.next().charAt(0);
        
        System.out.println("Enter a word");
        String word = sc.next();

        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();


        System.out.println(number);
        System.out.println(character);
        System.out.println(word);
        System.out.println(sentence);

        sc.close();
        
    }
}
