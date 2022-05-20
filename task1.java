package shrutiB;
import java.util.Scanner;
public class task1
{
    // fuction which implements the number guessing game
    public static void guessingNumberGame()
    {
        //scanner class
        Scanner sc = new Scanner(System.in);
        //generate the numbers
        int number = 1 + (int)(100*Math.random());
        // given N trials
        int N = 6;
        int i, guess;
        System.out.println("A number is chosen  between 1 to 100."+"Guess the number within 6 trials.");
        //iterate over N trials
        for(i=0; i<N;i++)
        {
            System.out.println("Guess the number: ");
            // take input for guessing
            guess = sc.nextInt();
            // if the number is guessed
            if(number==guess)
            {
                System.out.println("Congratulations!");
                System.out.println("You guessed the number");
                break;
            }
            else if(number> guess)
            {
                System.out.println("The number is greater than"+ "guess");
                break;
            }else if(number<guess);
            {
                System.out.println("The number is less than"+ guess);
            }

        }
        if(i==N)
        {
            System.out.println("You have finished "+" N trials.");
            System.out.println("The number was"+ number);
        }
    }
    // Driver code
    public static void main(String arg[])
    {
        //function call
        guessingNumberGame();
    }

}
