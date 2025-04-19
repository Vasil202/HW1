package lesson04;

import java.util.Scanner;

class les5 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int a = (int) (Math.random()*(100+1));

        System.out.println(a+"\nPlease your name?");
        {
        String name = console.nextLine();
            {
                System.out.println("Let the game begin!");
                System.out.println("Введите число");

                int[] numbers = {1,2,3,4,5,6,7,8,9,10};
                int x = console.nextInt ();
                switch (x) {
                    case 1,2,3,4:
                        System.out.println("Your number is too small. Please, try again");
                        break;
                    case 6,7,8,9:
                        System.out.println("Your number is too big. Please, try again..");
                        break;
                    case 5:
                        System.out.println("Congratulations:"  + name + "!");
                        break;
                    default:
                        System.out.println("Ведіть числа від 1 до 9");
                }}}}}
