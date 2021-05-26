import java.util.Scanner;
public class NumberGame2 {
    public static void main(String[]args){
        int randomNumber = (int)(Math.random()*100)+1;
        boolean hasWon = false;
        Scanner scanner = new Scanner(System.in);

        for(int i=10 ; i > 0 ; i--){
            System.out.println("You have " + i + "time(s) left for the guess");
            System.out.println("Please input an integer number between 0 and 100:");
            int guessNumber = scanner.nextInt();

            if(guessNumber < randomNumber){
                System.out.println("The number is greater than your guess.Try again.");
            }
            else if(guessNumber > randomNumber){
                System.out.println("The number is smaller than your guess.Try again.");
            }
            else{
                hasWon = true;
                break;
            }
        }
        if(hasWon){
            System.out.println("Your guess is CORRECT! You won the game!");
        }
        else{
            System.out.println("Sorry,you lose the game. Try again later.");
            System.out.println("The number is "+ randomNumber);
        }
    }
}