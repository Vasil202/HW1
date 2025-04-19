package lesson04;

import java.util.Scanner;

class myproject2 {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        Scanner console = new Scanner(System.in);
        int a = (int) (Math.random()*(100+1));

        System.out.println(a+"\nPlease your name?");
        {
        String name = console.nextLine();

            {
        System.out.println("Введите число");
                int i = console.nextInt ();
                if ( i<=49) {
                    System.out.println("Your number is too small. Please, try again");
                }
                     else if (i>=51) {
                System.out.println("Your number is too big. Please, try again..");
            }
                     else if (i==50) {
                    System.out.println("Congratulations:"  + name + "!");
                }
    }}}
}