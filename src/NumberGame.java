import java.util.Scanner;
public class NumberGame {
    public static void main(String[]args){
        int randomNumber = (int)(Math.random()*100) + 1 ; //generate a random integer number between 1-100(without 0 but can be 100)
        boolean hasWon = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("The programme has chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");

        for(int i = 10; i>0; i++){
            System.out.println("You have "+ i + " guess(es) left. Choose again");
            int guess = scanner.nextInt();
            if(randomNumber < guess){
                System.out.println("It's smaller than " + guess +".");
            }
            else if(randomNumber > guess){
                System.out.println("It's greater than " + guess +".");
            }
            else{
                hasWon = true;
                break;
            }
        }

        if(hasWon = true){
            System.out.println("CORRECT! YOU WIN!");
        }else{
            System.out.println("Game Over......You Lose!");
            System.out.println("The number was: " + randomNumber);
        }
    }
}
