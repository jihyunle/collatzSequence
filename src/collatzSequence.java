/*
You are going to develop an application to produce numbers in a sequence.

The user will be required to enter a number, and for that number, you will:

* Divide the number by 2 if it is even

* Multiply the number by 3, and add 1 if it is odd.

* Do this until you get to 1.

Ask the user if he/she would like to input another number, and continue until he/she does not want to enter any more numbers.

Show the results as you go. For example, the number 5 should produce the following output:

5 16 8 4 2 1

The number 3 should produce the following output:

3 10 5 16 8 4 2 1
*/
import java.util.Scanner;

public class collatzSequence {
    public static void main(String[] args){

        int num;
//        String playAgain = "y";
        String playAgain = " ";
        Scanner keyboard = new Scanner(System.in);

        do {
            // get user input
            System.out.println("Please enter a number: ");
            num = keyboard.nextInt();

            // if number is even, divide by 2
            // if number is odd, multiply by 3 and add 1
            // do this as long as number is not equal to 1
            while (num != 1) {
                if(num%2 == 0){
                    num /= 2;
                }else
                    num = num*3 + 1;
                System.out.println(num);
            }

            // ask if user wants to continue

            System.out.println("Would you like to play again with another number?: Y or N");
//            playAgain = " ";
            playAgain = keyboard.next();

        } while(playAgain.equalsIgnoreCase("y"));


        // exit message
        System.out.println("Thanks for playing! Goodbye");
        keyboard.close();
        System.exit(0);





    }
}
